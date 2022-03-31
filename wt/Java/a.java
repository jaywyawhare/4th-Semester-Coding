// nested class with protected access specifier


public class a {
	protected class B {
		protected class C {
			public void foo() {
				System.out.println("Hello");
			}
		}
	}
}

class Test {
	public static void main(String[] args) {
		a.B b = new a().new B();
		a.B.C c = b.new C();
		c.foo();
	}
}