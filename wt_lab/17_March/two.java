// Define an interface Motor with a data member –capacity and two methods
// such as run() and consume(). Define a Java class „Washing machine‟ which
// implements this interface and write the code to check the value of the
// interface data member thru an object of the class.


import java.util.Scanner;

interface Motor {
	int getCapacity();

	void run();

	void consume();
}

class WashingMachine implements Motor {
	private int capacity;

	public WashingMachine(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void run() {
		System.out.println("Washing Machine is running");
	}

	public void consume() {
		System.out.println("Consume water");
	}
}

public class two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity: ");
		int capacity = sc.nextInt();
		WashingMachine wm = new WashingMachine(capacity);
		System.out.println("Capacity: " + wm.getCapacity());
		wm.run();
		wm.consume();
	}
}