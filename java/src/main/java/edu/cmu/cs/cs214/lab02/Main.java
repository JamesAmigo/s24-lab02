package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(5);
        Circle circle = new Circle(1);

        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        Renderer renderer2 = new Renderer(square);
        renderer2.draw();

        Renderer renderer3 = new Renderer(circle);
        renderer3.draw();

    }
}
