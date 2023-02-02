interface A{
	int i=0;
}

class B implements A{
	
}

 class Main{
	public static void main(String args[]){
		B b=new B();
		A.i=5;
		System.out.println(A.i);
	}
}