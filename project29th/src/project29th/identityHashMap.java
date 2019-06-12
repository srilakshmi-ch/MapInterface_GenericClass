package project29th;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;

@SuppressWarnings("unused")
public class identityHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();
		 Integer I1=new Integer(10);
		 Integer I2=new Integer(11);
		   hm.put(I1, "cat");
		   hm.put(I2,"apple");
		  hm.put(new Integer(I2),"apple");//it use equals operator so it compares names of keys.here we are creating different reference but id does not compare memory references so duplication of keys not allowed by comparing names 
		   System.out.println(hm);
		   /*Set<Integer> s1=hm.keySet();
		   for(Integer key:s1)
		   {
		 	  String value=hm.get(key);
		 	  System.out.println(key + " , "+value);
		   }*/
		   IdentityHashMap<Integer,String> hm1=new IdentityHashMap<Integer,String>();
			 Integer I11=new Integer(10);
			 Integer I21=new Integer(11);
			   hm1.put(I11, "cat");
			   hm1.put(I21,"apple");
			   
			   hm1.put(new Integer(I21),"app");//it uses == operator it compares reference of keys.so here we have to create two references with same name  
			   System.out.println(hm1);
	}

}
