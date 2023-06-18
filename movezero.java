
public class movezero {
public static void main (String args[])
{ int count=0;
	int nums[]= {4,6,0,7,0,9,0};
	for (int i=0;i<nums.length;i++)
	{
		if (nums[i]!=0) {
			nums[count]=nums[i];
			count++;
			
		}
	}
		for (int i=count;i<nums.length;i++)
		{
			nums[i]=0;
		}
		for(int j :nums) {
			System.out.print(j);
			
		}
}

}
