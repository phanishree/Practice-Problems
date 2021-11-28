import java.util.Scanner;


/*please test the programs for these numbers 1234,-715,0189,-0715 */

public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
int n=sc.nextInt();
String s=n+"";
if(s.startsWith("-")&&!s.endsWith("0")) {             //for numbers start with negavtive,like -715
	s=s.substring(1,s.length());
	StringBuilder sd=new StringBuilder(s);
	sd.reverse();
	System.out.println("-"+sd);
}else if(s.startsWith("-")&&s.endsWith("0")) {          //for numbers like -0175
s=s.substring(1,s.length());
	s=s.substring(0,s.length()-1);
	StringBuilder sd=new StringBuilder(s);
	sd.reverse();
System.out.println("-"+sd);
}
else {                                         //for only positive numbers and not end with zero like 1234
	if(s.endsWith("0"))
		s=s.substring(0,s.length()-1);
	StringBuilder sd=new StringBuilder(s);
	sd.reverse();
System.out.println(sd);
}
	}

}
