
public class BlueShapeDecorator extends ShapeDecorator {
	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	public void draw() {
		decoratedShape.draw();
		setBlueBorder(decoratedShape);
	}
	public void setBlueBorder(Shape decoratedShape) {
		System.out.println("Border Color: Blue");
	}
}
