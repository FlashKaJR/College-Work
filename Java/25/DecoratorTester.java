
public class DecoratorTester {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle with red border");
		redCircle.draw();
		
		System.out.println("\nRectangle with red border");
		redRectangle.draw();
		
		Shape blueCircle = new BlueShapeDecorator(new Circle());
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
		System.out.println("\nCircle with blue border");
		blueCircle.draw();
		
		System.out.println("\nRectangle with blue border");
		blueRectangle.draw();
	}
}
