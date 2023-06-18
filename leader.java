
public class leader {
public static void main (String args[])
{
	int array[] = {16, 17, 4, 3, 5, 6, 9, 1, 8, 2};
    int size = array.length;
    System.out.println("Leaders in the array are: ");

    //LogicImplementtaion
    for (int i = 0; i < size; i++){
        for ( j = i + 1; j < size; j++){
          if (array[i] <=array[j])
             break;
       }
       if (j == size) // the loop didn't break{
       
          //print the result
          System.out.print(array[i] + " ");
     
}
}
}