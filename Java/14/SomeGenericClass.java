
public class SomeGenericClass<T> {

	private T t;
	
	public void add(T aT) {
		this.t = aT;
	}
	
	public T get() {
		return this.t;
	}
}
