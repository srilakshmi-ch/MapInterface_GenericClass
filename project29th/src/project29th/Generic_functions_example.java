package project29th;
class ex
{
	static <T> void display(T element)
	{
		System.out.println(element.getClass().getName()+"...."+element);
	}
	
	static <A> void print(A[] elements) {
		for (A e : elements) {
			System.out.println((A)e);
		}
	}
	}
	public class Generic_functions_example 
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex.display(10);
		ex.display("srilakshmi");
		Character[] chararr={'a','b','c','z'};
		Integer[] intarr= {1,2,3,7,9,40};
	  ex.print(intarr);
		ex.print(chararr);

	}

}
