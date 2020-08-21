package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("My route", "Home", "abc");
            case PAINTING:
                return new PaintingTask("Abstract", "Blue", "Paint");
            case SHOPPING:
                return new ShoppingTask("Dairy shopping", "Milk", 1);
            default:
                return null;
        }
    }
}
