package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCol = new ShapeCollector();
        //When
        shapeCol.addFigure(new Circle());
        //Then
        Assert.assertEquals("Circle", shapeCol.shapes.get(0).getShapeName());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCol = new ShapeCollector();
        Shape circle = new Circle();
        shapeCol.addFigure(circle);
        //When
        shapeCol.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCol.shapes.size());
    }
    @Test
    public void getFigure() {
        //Given
        ShapeCollector shapeCol = new ShapeCollector();
        Shape circle = new Circle();
        shapeCol.addFigure(circle);
        //When
        shapeCol.getFigure(0);
        //Then
        Assert.assertEquals(circle, shapeCol.shapes.get(0));
    }
    @Test
    public void showFigures (){
        //Given
        ShapeCollector shapeCol = new ShapeCollector();
        shapeCol.addFigure(new Circle());
        //When
        shapeCol.showFigures();
        //Then
        Assert.assertEquals("Circle", shapeCol.shapes.get(0).getShapeName());
    }

}

