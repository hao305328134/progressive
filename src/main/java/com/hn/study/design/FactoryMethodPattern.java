package com.hn.study.design;

/**
 * 工厂方法模式
 *
 * @author Mr.hn
 * 2022/08/09 17:18
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }


    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    static abstract class ShapeFactory {
        abstract Shape createShape();
    }

    static class CircleFactory extends ShapeFactory {
        @Override
        Shape createShape() {
            return new Circle();
        }
    }

    static class RectangleFactory extends ShapeFactory {
        @Override
        Shape createShape() {
            return new Rectangle();
        }
    }
}
