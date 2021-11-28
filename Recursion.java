import java.util.Arrays;

public class Recursion {
	int a=0;
	public int se[]= {1,2,7,5,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=2;
Recursion r=new Recursion();
r.func(r.se,0,4);
	}
void func(int p[],int s,int e) {
	//System.out.println("hey,i'm recursive  "+p--);
	if(s<e) {
	int mid =(s+e)/2;
	int left[]=new int[mid];
	int right[]=new int[e-mid];
	left=Arrays.copyOfRange(se,s, mid+1);
	right=Arrays.copyOfRange(se, mid+1, e+1);
//System.out.println(Arrays.toString(left));
//System.out.println(Arrays.toString(right));
	func(p,s,mid);
	func(p,mid+1,e);
	System.out.println("No of times non recursion called is "+a);
	notRecursive(left,right);
	}
}
void notRecursive(int left[],int right[]) {
	a++;
	//System.out.println("Hey, i'm non recursive "+a++);
	System.out.println(Arrays.toString(left)+"  "+Arrays.toString(right));
//	System.out.println(Arrays.toString(right));
}
}
