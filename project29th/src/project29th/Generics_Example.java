package project29th;

import java.util.ArrayList;

public class Generics_Example {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList arr=new ArrayList();
	     arr.add("chitti");
	     arr.add("sri");
	     arr.add("lakshmi");
	     arr.add(1);
	     arr.add(2.1);
	     arr.add('c');
	     for(Object obj:arr)
	     {
	    	 //String s=(String)obj;
	    	// System.out.println(s);
	    	 System.out.println(obj);
	     }
	     System.out.println("another way of printing array list is as follows");
	     for(Object ob:arr)
	     {
	    	 if(ob instanceof String)
	    	 {
	    		 String s=(String)(ob);
	    		 System.out.println("this is String element = "+s);
	    	 }
	    	 else if(ob instanceof Integer)
	    	 {
	    		 Integer s=(Integer)(ob);
	    		 System.out.println("this is integer element = "+s);
	    	 }
	    	 else
	    	 {
	    		 System.out.println(ob.getClass().getName()+"...."+ob);
	    	 }
	     }
	     //by using generics
	     ArrayList<String> arr2=new ArrayList<String>();  
	     arr2.add("hii");
	    arr2.add("welcome");
	    for(String str:arr2)
	    {
	    	System.out.println(str);
	    }
	    
	}

}
