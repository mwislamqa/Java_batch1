package Java_Basic.com;

	class A {
	void parientClass() {
		System.out.println("parents");
	}

	class B extends A {
		void childClass1() {
			System.out.println("child class1");
		}
	}

	class C extends B {
		void childClass2() {
			System.out.println("child class2");
		}
	}

	public static class D {
		public static void main(String[] args) {
		//	C c = new C();

		}
	}

	}

