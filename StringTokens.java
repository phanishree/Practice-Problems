import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter the String");
	        String d=scan.next();
	        System.out.println("Enter the split number");
	        int n=scan.nextInt();
	        String e="";
	        String y="";
	        String f="";
	       if(d.length()%2==0) {
	        for(int i=0;(i<d.length());) {
	        	if(i+n<d.length()) {
	        	 e=d.substring(i,i+n);
	        //	 d=d.substring(i,i+n);
	        	 if(i==0)
	        		 y=y+e;
	        	 else
	        		 y=y+"-"+e;
	        	 if(i==d.length()-1)
	        		 y=y+e;
	        	i=n+i;
	        	}
	        	else
	        		break;}
	        if(d.charAt(d.length()-1)!=y.charAt(y.length()-1)) {
	      char q= y.charAt(y.length()-1);
	       int a=d.indexOf(q);
	  //     String hu=d.substring(a,d.length());
	    //   if(hu.length()%2==0) {
	      // }
	       y=y+"-"+d.substring(a,d.length());
	        }
	        
	        System.out.print(y);
	        }
	       else {
	    	   String odd="";
	    	   odd=d.substring(0,d.length()-1);
	    	   for(int i=0;i<odd.length();) {
		        	if(i+n<=odd.length()) {
		        	 e=odd.substring(i,i+n);
		        	 if(i==0)
		        		 y=y+e;
		        	 else
		        		 y=y+"-"+e;
		        	 if(i==odd.length()-1)
		        		 y=y+e;
		        	i=n+i;
		        	}}
	   y=y+"-"+d.substring(odd.length(),d.length());
	        System.out.print(y);
	       }
	  //      System.out.println(Arrays.toString(we));
	        // Write your code here.
	        //String main[]=new String[s.length()];
	     /*   String main[]=null;
	        String l="";
	        System.out.println("hey");
	        String delims = "[ .,'?!]+";
	        String[] tokens = s.split(delims);

	     //   String st[]={"/!","/,","/?","/.","/_","/'","/@"," "};
	     /*   main=s.split(",");
	        for(int i=0;i<main.length;i++)
	        l=l+" "+main[i]+"";
	        System.out.println(l);*/
	        
	  /*  for(int i=0;i<st.length;i++){
	       // 	if(s.contains(st[i])) {
	            main=s.split(st[i]);
	            for(int j=0;i<main.length;i++)
	            s=s+" "+main[i]+"";*/
	  //      	}
	       // }
	//    String[]hu=s.split(" ");
	      //  for(int i=0;i<tokens.length;i++)
	      //  System.out.println(tokens[i]);*/
	}

}
