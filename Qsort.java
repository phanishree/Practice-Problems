
import java.util.Arrays;

class quicksort{
public	int pIndex;
	//int start,end;
	Qsort qs=new Qsort();
	void Q(int a[],int start,int end) {
	//start=0;
	//end=a.length-1;
		if(start<end) {
		pIndex=qs.Partition(a,start,end);
		Q(a,start,pIndex-1);
		Q(a,pIndex+1,end);
	
	}}
}
public class Qsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {18,7,8,3,99,2,4};

quicksort q=new quicksort();
q.Q(a,0,6);
System.out.print(Arrays.toString(a));
	}
int Partition(int a[],int s,int e) {
	int pivot=a[e];
	int PIndex=s,i,temp;
	for( i=s;i<e;i++) {
		if(a[i]<pivot) {
			temp=a[i];
		a[i]=a[PIndex];
		a[PIndex]=temp;
		PIndex++;
		}
	
		}
	temp=a[e];
	a[e]=a[PIndex];
	a[PIndex]=temp;
	return PIndex;
}
}

