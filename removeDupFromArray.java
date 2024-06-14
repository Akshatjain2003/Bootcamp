public class removeDupFromArray {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,3,3};
        int r = removeDupFromArray(nums);
       //System.out.println();
    }
    public static int removeDupFromArray(int [] nums){
        int w =0;
        for(int r =1; r<nums.length; r++){
            if(nums[w]!=nums[r]){
                w++;
                nums[w]=nums[r];
            }
        }
        return w+1;
    }
}
