import java.io.IOException;
import java.io.*;

public class pattern {
	  public static void main(String args[])throws IOException {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int t=Integer.parseInt(br.readLine());
	        while(t!=0)
	        {
	            int c=0;
	            int n=Integer.parseInt(br.readLine());
	            String s=br.readLine();
	             String s1=br.readLine();
	            for(int i=0;i<n-1;i++)
	            {
	                if(s.charAt(i)==s1.charAt(i))
	                {
	                c++;
	                }
	                else if(s.charAt(i)!=s1.charAt(i))
	                {    
	                if(s1.charAt(i)!='N')
	                i++;
	                }
	            }
	            if(s.charAt(n-1)==s1.charAt(n-1))
	            c++;
	            System.out.println(c);
	            t--;
	        }
	        
	    }
	}




