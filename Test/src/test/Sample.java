package test;

class Sample1 {
	protected int a =10;
	
}
public class Sample extends Sample1{
	protected int b =20;
	void sample1(){
		//Sample1 s = new Sample1();
		System.out.println("hell " + a);
	}
	
	public static void main(String[] args){
		Sample s = new Sample();
		s.sample1();
	}
}