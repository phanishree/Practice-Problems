import java.util.Arrays;

public class StringReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aabccca",j="";
char []b=s.toCharArray();
Arrays.sort(b);
s="";
for(int i=0;i<b.length;i++)
	s=s+b[i];      //now s="aaabcc";
StringBuilder sb=new StringBuilder(s);
sb.delete(0, 2);
System.out.println(s);
System.out.println(sb);
for(int i=0;i<s.length();) {
	if(s.charAt(i)==s.charAt(i+1)) {                            // //now s="aaabcc";
		s=s.substring(i+2,s.length());
		
	//	System.out.println(s+","+i);
	}
	else {
		j=j+s.substring(0,1);
		//System.out.println(j);                  //aaabccc
		i++;
		//j=s;
		}
	
}
//System.out.println(j);


	}

}
