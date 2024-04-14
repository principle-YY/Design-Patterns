package com.patterns.behavioral.command;

/**
 * 将所有文字复制到剪切板
 */
public class CopyCommand extends Command {
    CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
