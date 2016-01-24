package interview.learning.classandinterface;

public interface Interface1 {
	
	 public abstract void latest();
	 
	 public final String a="jellybeans";

}

 class Abcd implements Interface1
{
	public void latest()
	{
		System.out.println("hello");
	}
	
}