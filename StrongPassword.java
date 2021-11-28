import java.util.Scanner;

public class StrongPassword {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n");

	boolean f=false;
	boolean a=f,b=f,c=f,d=f;
	int n=sc.nextInt();
	String h[]=new String[n];
	String s="";
	StringBuilder sb=new StringBuilder(n);
	System.out.println("enetr the password");
for(int i=0;i<n;i++) {
		h[i]=sc.next();
	}
for(int i=0;i<h.length;i++) {
s=s+h[i];
}
//char f='y';
if(s.length()<6) {
	System.out.println(6-s.length());
}
else {

	for(int i=0;i<s.length();i++) {
		
		if(Character.isDigit(s.charAt(i))) {
			a=true;
		}
		if(Character.isLowerCase(s.charAt(i))) {
			b=true; 
		}
		if(Character.isUpperCase(s.charAt(i))) {
			c=true;
		}
		if((int)s.charAt(i)>=33&&(int)s.charAt(i)<=43) {
			d=true;
		}
		if(a==true&&b==true&&c==true&&d==true) {
			break;
		}
	}
	int q=0;
	if(a==f)
		q++;
	if(b==f)
		q++;
	if(c==f)
		q++;
	if(d==f)
		q++;
	System.out.println(q);

}

//if(a==f&&b==f&&c==f&&d==f) {
	//q=4;
//}

}
}