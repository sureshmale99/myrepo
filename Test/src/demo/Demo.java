package demo;

public class Demo extends Sample{
	public static void main(String[] args){
		Demo d = new Demo();
		d.demo();
		
	}
	public void demo()
	{
		Sample s = new Sample();
		System.out.println(s.b);
	}
}
class Sample{
	protected int b =30;
}
