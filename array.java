//import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        int arr1[] = {3,4,5,2,1};
        int i =0 , j = arr1.length -1;
        while(i<j){
            int temp = arr1[i];
            arr1[i++] = arr1[j];
            arr1[j--] = temp;
        }
        for (int x: arr1){
            System.out.println(x);
        }

    }


    
}
