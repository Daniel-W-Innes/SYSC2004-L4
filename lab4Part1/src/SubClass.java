
public class SubClass extends MyClass{
	private int b;
	public SubClass(int a, int b) {
		super(a);
		this.b = b;
	}
	public int getB() {
		return b;
	}
	public String toString() {
		return super.toString() + " b = " + b;
	}
}
