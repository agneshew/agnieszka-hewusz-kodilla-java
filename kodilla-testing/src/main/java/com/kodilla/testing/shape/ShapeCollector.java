package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public List<Shape> shapes;
    public ShapeCollector () {
        shapes = new ArrayList<Shape>();
    }
    public void addFigure (Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure (Shape shape) {
        shapes.remove(shape);
    }
    public void getFigure (int n) {
        shapes.get(n);
    }
    public List<Shape> showFigures() {
        return this.shapes;
    }
}
