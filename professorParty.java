import java.util.*;

public class professorParty {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array = ");
            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            System.out.println("Enter the elements of array 1 = ");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            System.out.println("Enter the elements of array 2 = ");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }
            Arrays.sort(arr2);

            boolean arrComp = false;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        arrComp = true;
                        break;
                    }
                }
                if (arrComp) {
                    break;
                }
                
            }
            if (arrComp) {
                System.out.println("Boy's Party");
            } else {
                System.out.println("Girl's Party");
            }
        
        }
    }
}
