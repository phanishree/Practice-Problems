import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]={"act","dog","god","cat","tac","Tay"};
Hashtable<String,String> hs=new Hashtable<>();
HashMap<String,ArrayList<String>> hss=new HashMap<>();

ArrayList <String> a=new ArrayList<>();
Arrays.sort(s);

char ca[];
String key;
String val;
for(int i=0;i<s.length;i++) {
	ca=(s[i]+"").toCharArray();
	val=new String(ca);
	Arrays.sort(ca);
	key=new String(ca);
	
	if(hss.containsKey(key)) {
		hss.get(key).add(val);
	}
	else {
		hss.put(key,new ArrayList());
		hss.get(key).add(val);
	}
	if(!a.contains(key))
		a.add(key);
	
}
int grps=0;
System.out.println("The anagrams among given strings can be grouped as follows");
for(int i=0;i<a.size();i++) {
	
	if(hss.get(a.get(i)).size()>1) {
	System.out.println(hss.get(a.get(i)));
	grps++;
 }
	}
System.out.println("Total of "+grps+" groups");
	}

}
