package Ex04;

public class ShapeFactory {
		
	public Shape getShape(String shapeType) {


	    if (shapeType.equalsIgnoreCase("CIRCLE")) {
	        return new Circle();
	    }

	    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
	        return new Rectangle();
	    }

	    if (shapeType.equalsIgnoreCase("SQUARE")) {
	        return new Square();
	    }

	    if (shapeType.equalsIgnoreCase("TRIANGLE")) {
	        return new Triangle();
	    }

	    return null;
	}

}
