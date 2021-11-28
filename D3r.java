
public class D3r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String br="{{[[(())]]}}";//{[( )]}//{[}]
String fh=br.substring(0,(br.length()/2));
String sh=br.substring((br.length()/2),br.length());
System.out.println(fh + " "+sh);
int f=1;
for(int i=0,j=sh.length()-1;i<sh.length()&&j>=0;i++,j--) {
	if(fh.charAt(i)=='(') {
		if(!((fh.charAt(i)-sh.charAt(j))==-1)){
			f=0;
			break;
		}
	}
	else if(fh.charAt(i)=='[') {
		if(!((fh.charAt(i)-sh.charAt(j))==-2)){
			f=0;
			break;
		}
	}
	else {
		if(!((fh.charAt(i)-sh.charAt(j))==-2)){
			f=0;
			break;
		}
	}
}
if(f==1) {
	System.out.println("YES");
}
else
	System.out.println("No");
	}

}
/*if(fh.length()==sh.length()) {
	for(int i=0,j=sh.length()-1;i<sh.length()&&j>=0;i++,j--) {
		Character c1=new Character(fh.charAt(i));
		Character c2=new Character(sh.charAt(j));
		System.out.println(fh.charAt(i) + " "+sh.charAt(j));
		String s1=fh.charAt(i)+"";
		String s2=sh.charAt(j)+"";
		System.out.println(s1 + " "+s2);
		if(s1.equals(s2)) {
	//	System.out.println(fh.charAt(i) + " "+sh.charAt(j));
	//	if(c1.equals(c2)) {
			System.out.println("hello");
			System.out.println(fh.charAt(i) + " "+sh.charAt(j));
		}
		else {
			f=1;
			break;
		}
	}
}*/

