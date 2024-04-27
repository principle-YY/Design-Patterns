package com.patterns.behavioral.memento;


import javax.swing.*;
import java.io.*;
import java.util.Base64;

/**
 * 编辑器代码
 */
public class Editor extends JComponent {
    private Canvas canvas;
    private CompoundShape allShape = new CompoundShape();
    private History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(Shape... shapes) {
        allShape.clear();
        allShape.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes() {
        return allShape;
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        if (history.undo()) {
            canvas.repaint();
        }
    }

    public void redo() {
        if (history.redo()) {
            canvas.repaint();
        }
    }

    public String backup() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.allShape);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException ex) {
            return "";
        }
    }


    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShape = (CompoundShape) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.println("IOException occurred.");
        }
    }
}
