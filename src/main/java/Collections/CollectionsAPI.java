package Collections;

import java.util.ArrayList;
import java.util.Hashtable;

public class CollectionsAPI {

	public static void main(String[] args) {
		//DYNAMICALLY CHANGING ARRAYS - ARRAYLIST & HASHTABLE
ArrayList<String> a=new ArrayList<String>();

a.add("A");
a.add("B"); 
a.add("C");
a.add("D");
//a.add(1); Only String values are allowed ArrayList<String>..

System.out.println("--------ARRAY LIST----------");
System.out.println("second element in list"+a.get(1));
System.out.println("Size of list"+a.size());

for(int i=0;i<a.size();i++){
	System.out.println(a.get(i));
}

System.out.println("--------HASHTABLE----------");
Hashtable<String, String> h=new Hashtable<String, String>();
h.put("name", "Bharath"); //put("unique key","value"); //key value pair
h.put("Cell", "7760510257");
h.put("Married", "yes");

System.out.println(h.get("Married"));
h.put("Married", "no");
System.out.println(h.get("Married"));
System.out.println(h.get("Cell"));
	}

}
