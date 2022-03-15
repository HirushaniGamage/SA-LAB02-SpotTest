package Ex04;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();

		System.out.println("Insert Circle :: draw() method.");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        System.out.println("Insert Rectangle :: draw() method.");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        System.out.println("Insert Square :: draw() method.");
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

	}

}
