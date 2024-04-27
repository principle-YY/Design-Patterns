package com.patterns.structural.adapter;

/**
 * 方钉到圆孔的适配器
 */
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));
        return result;
    }
}
