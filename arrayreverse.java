import java.util.Arrays;

public class arrayreverse {
public static void  main(String args[]) {
int arr[]= {3,4,5,6};
int i=0;
int j=arr.length-1;
while (i<=j)
{
	int temp =arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
	 i=i+1;
	 j=j-1;
}
for (int c=0;c<arr.length;c++)
	
{
System.out.print(arr[c]+"");
}

}
}


