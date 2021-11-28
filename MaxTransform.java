import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxTransform {


	 static int count=1;


	 static ArrayList solve(int[] A) {
		
			 int n=A.length;
		
			 ArrayList<Integer> b=new ArrayList();
			 
      for(int k=0;k<n;k++) {
	
	      for(int i=0;i<=(n-k-1);i++) {
		
     		int j=i+k;
	    	int max=A[i];
	    	
	          for(int l=i;l<=j;l++) {
		          if(A[l]>max)
			         max=A[l];
	             }
	          b.add(max);
		
	                }
               }
count++;

	
if(count<=2) {
	int another[]=new int[b.size()];
	for(int e=0;e<b.size();e++) {                                             
		another[e]=b.get(e);
	}
	 List<Integer> newsa=new ArrayList<Integer>();
	newsa=solve(another);
	int sum=0;
	for(int f=0;f<newsa.size();f++) {
		sum+=newsa.get(f);
	}
	
		System.out.print(sum+" ");
	
}

	return b;
	}

		public static void main(String args[])

		{

			int []a= {3,2,1};
			solve(a);
			


		}

	}