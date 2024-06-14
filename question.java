//find the smallest number in an array and 
//find all those number which are divisible by the smallest number

import java.util.*;
public class question {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array = ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            int div[] = new int[n];
            System.out.println("Enter the elements of array = ");
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Smallest element in array is = "+ arr[0]);
            for (int i = 0 ;i<arr.length;i++){
                if(arr[i]%arr[0]==0)
                {
                    div[i] = arr[i];
                }
            }
            System.out.println("Elements divisible by smallest element are = ");
            for(int i =0; i<div.length;i++){
                if(div[i]!=0)
                System.out.print(" "+div[i]);
            }
        }

    }
}