class B {
	B(){
		System.out.println("B()");
	}

	{
		System.out.println("B block 1");
	}
}

class A extends B {

	int i = 10;

	A(){
		System.out.println("A()");
	}

	{
		System.out.println("A block 1");
	}

	public static void main(String[] args){
		A a1 = new A();
		System.out.println(a1.i);

	}

}