import java.util.Arrays;

public class D3t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0,1,0,1,1,0,1};
int fh[]=new int[a.length];
int sh[]=new int[a.length];
int l=0,m=0;
for(int i=0;i<a.length;i++) {
	if(a[i]==0) {
		fh[l]=a[i];
		l++;
	}
	else {
		sh[m]=a[i];
		m++;
	}
}
int i;
for(i=0;i<l;i++) {
	a[i]=fh[i];
}
for(int j=0;j<m&&i<a.length;j++) {
	a[i]=sh[j];
	i++;
}
System.out.println(Arrays.toString(a));
	}

}
