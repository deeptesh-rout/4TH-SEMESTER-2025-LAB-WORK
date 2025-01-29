class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class JavaQuestion5 {
    public static void main(String[] args) {
        Shape[] shapes = { new Shape(), new Circle(), new Rectangle(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}


/*
 * 
 * output 
 * 
Drawing a shape
Drawing a circle
Drawing a rectangle
Drawing a triangle

 */