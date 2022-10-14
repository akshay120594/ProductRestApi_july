
public class TestRecursion {

	int count = 0;

	void fun() {
		count++;
		System.out.println(count);
		if (count < 3)
			fun();
	}

	public static void main(String[] args) {
		TestRecursion obj = new TestRecursion();
		obj.fun();
	}

}