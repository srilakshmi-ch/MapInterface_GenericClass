package project29th;
import java.util.*;
import java.util.Map.Entry;
public class HashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String,String> hm=new HashMap<String,String>();
  hm.put("c", "cat");
  hm.put("a","apple");
  hm.put("b","boll");
  hm.put("a","allow");
  System.out.println(hm);
  System.out.println("by using keySet, get Functions to display elements");
  Set<String> s1=hm.keySet();
  for(String key:s1)
  {
	  String value=hm.get(key);
	  System.out.println(key + " , "+value);
  }
  System.out.println("by using entrySet, getKey , getvalue Functions to display elements");
  Set<Entry<String,String>> s2=hm.entrySet();
  for(Entry<String,String> e:s2)
  {
	  String key=e.getKey();
	  String value=e.getValue();
	  System.out.println(key+" , "+value);
  }
/* HashMap<Employee, Employee> hm1 = new HashMap<>();
	Employee employee = new Employee();
	Employee employee1 = new Employee();
	hm1.put(employee, employee1);
	  Set<Employee> s3=hm1.keySet();
	  for(Employee key:s3)
	  {
		  String value=hm.get(key);
		  System.out.println(key + " , "+value);
	  }*/
	
	
	}

}
