package project29th;
class GenericClass<T>
{
	T obj;
	GenericClass(T x)
	{
		obj=x;
	}
	public T get()
	{
		
		return obj;
	}
}
public class Generic_Class_Example {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GenericClass<Integer> ob=new GenericClass<Integer>(18);
    GenericClass<String> ob2=new GenericClass<String>("srilakshmi");
    System.out.println("this is integer value pass to gereric class = "+ob.get());
    System.out.println("this is String value pass to generic class ="+ob2.get());
	}

}
