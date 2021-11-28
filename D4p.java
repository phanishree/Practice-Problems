
import java.util.*;
public class D4p{
public static void main(String[] args){
int a[]={1,2,3,3,4,5};//o+o=e,e+e=e
HashMap<Integer,Integer> h=new HashMap<>();
HashMap<Integer,ArrayList<Integer>> hs=new HashMap<>();
hs.put(0,new ArrayList<>());
hs.put(1,new ArrayList<>());
for(int i=0;i<a.length;i++){
if(a[i]%2==0){

hs.get(0).add(a[i]);
}
else {
	
	hs.get(1).add(a[i]);
}

}
for(int i=0;i<hs.get(1).size()-1;i++){
	
	System.out.println(hs.get(1).get(i)+","+hs.get(1).get(i+1));
}
for(int i=0;i<hs.get(0).size()-1;i++){
	
	System.out.println(hs.get(0).get(i)+","+hs.get(0).get(i+1));
}

}

}