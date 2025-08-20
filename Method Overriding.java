
class Shape {
    
    void draw() {
        System.out.println("Drawing a shape...");
    }
}


class Circle extends Shape {
    
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}


class Square extends Shape {
    
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}


public class TestPolymorphism {
    public static void main(String[] args) {
        // A reference of type Shape can hold an object of its subclass
        Shape myShape;

        myShape = new Circle(); 
        myShape.draw();         

        myShape = new Square(); 
        myShape.draw();         
    }
}