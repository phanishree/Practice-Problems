import java.util.Scanner;

/*this sol gives O(n^m)  where m=no of queries(queries.length) */
/*import java.util.*;
public class ArrayManipulator {
	 static long arrayManipulation(int n, int[][] queries) {
         long arr[]=new long[n];
    for(int c=0;c<n;c++)
    arr[c]=0;
    int k=0;int p=1;int q=2;
    System.out.println(queries.length);
    for(int i=0;i<queries.length;i++){
        int a=queries[i][k]-1;
        int b=queries[i][p]-1;
        long val=queries[i][q];
        for(int in=a;in<=b;in++){
        arr[in]=arr[in]+val;
       // System.out.print(Arrays.toString(arr));
    }
       // System.out.print(Arrays.toString(arr));
    }
    Arrays.sort(arr);
    return arr[n-1];
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int q[][]= {{1,2,100},{2,5,100},{3,4,100},{3,4,100},{3,4,100},};
		
long res=ArrayManipulator.arrayManipulation(n, q);
System.out.println(res);
	}

}*/
public class ArrayManipulator {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
 
int n = in.nextInt();
int m = in.nextInt();
 
long[] myArray = new long[n+1];
int a, b, k;
 
// Loop through all the operations, creating our difArray in-place
for (int i = 0; i < m; i++){
a = in.nextInt();
b = in.nextInt();
k = in.nextInt();
myArray[a] += k;
 
// We don't care of tracking N+1
if((b + 1) <= n) myArray[b + 1] -= k;
}
 
// To store the historical max as we go summing,
// we need big variables for big numbers (remember the contraints)
long max = 0;
// To sum all elements
long sum = 0;
// Loop through our array to get our result
for (int j = 1; j <= n; j++){
sum += myArray[j];
if (max < sum) max = sum;
}
 
System.out.println(max);
}}
