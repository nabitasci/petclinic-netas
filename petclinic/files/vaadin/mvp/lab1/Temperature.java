package vaadin.mvp.lab1;

public class Temperature {
	private int value;

	public int getValue() {
		return value;
	}

	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	void setValue(int value) {
		this.value = value;
	}
}
