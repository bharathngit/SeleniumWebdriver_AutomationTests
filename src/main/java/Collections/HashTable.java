package Collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> table1=new Hashtable<String, String>();
		table1.put("City1", "Bellary");
		table1.put("City2", "NewYork");
		table1.put("City3", "Bengaluru");
		table1.put("", "NULL1");
		table1.put("", "NULL2");


		Hashtable<String, String> table2=new Hashtable<String, String>();
		table2.put("City1", "583101");
		table2.put("City2", "10010");
		table2.put("City3", "600055");
		
		Hashtable<String, Hashtable<String,String>> nest=new Hashtable<String, Hashtable<String,String>>();
		nest.put("NameTable",table1);
		nest.put("ZipTable",table2);
		
		System.out.println(nest.get("NameTable").get("City1"));
		System.out.println(nest.get("NameTable"));
		System.out.println(nest.get("ZipTable").get("City2"));
	}

}
