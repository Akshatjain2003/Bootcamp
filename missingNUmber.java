public class missingNUmber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println("Missing number is ");
        System.out.println(missingNUmber(arr.length+1,arr));
    }
    static int missingNUmber(int n, int arr[]){
        int x = 0;
        int y = 0;
        for(int i =1; i<=n;i++){
            x = x^i;
        }
        for(int val: arr){
            y = y^val;
        }
        return x^y;
    }
}
