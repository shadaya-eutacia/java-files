public class Exp5_ShapeHierarchy {

    static class Shape {
        public void draw() {
            System.out.println("Drawing a generic shape.");
        }

        public double calculateArea() {
            return 0.0;
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Circle.");
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle.");
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("=== Circle Details ===");
        circle.draw();
        System.out.printf("Area: %.2f\n", circle.calculateArea());

        System.out.println("\n=== Rectangle Details ===");
        rectangle.draw();
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
    }
}