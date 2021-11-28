
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class maTransform {

		static int count=0;

		 static int[] solve(int[] A,List aara) {

			 int n=A.length;

			 int a[]=new int[100000];

			// for(int ele:A)

				// sa.add(ele);

			 for(int k=0;k<=n-1;k++)

				 for(int i=0;i<=n-k-1;i++)

				 {

					int j=i+k;

					int max=A[i];

					 for(int h=i;h<=j;h++) {
						if(A[h]>max)
							max=A[h];
					}

						//newsa.add(sa.get(h));
					
					aara.add(max);

				 }
                int b[]=new int[aara.size()];

               for (int i =0; i < aara.size(); i++) 
                       b[i] =  (int)aara.get(i);


			return b;

		    }


		public static void main(String args[])

		{

			

			List<Integer> sa=new ArrayList<Integer>();

			 List<Integer> newsa=new ArrayList<Integer>();

			int []a= {3,2,1};
			
			int b[]=solve(a,newsa);
	
			int ss[]=solve(b,sa);

			int sum=0;

			for(int ele:ss)

			{
				System.out.print(ele+" ");

				sum+=ele;

			}
System.out.println();
if(a.length<=4000)
			System.out.print("S(S(a)="+sum+" ");
else
	System.out.print("S(S(a)="+sum%(10^9+7)+" ");
		}

		    

		    

	}