public class J26 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for ( int i = 0; i < nums.length-1;){
            if (nums[i] == nums[i+1]){
                System.out.print(nums[i]+" ");
                count+=1;
                System.out.println(count);
                for (int j = i+1; j < nums.length-1-count; ++j){
                    nums[j] = nums[j+1];
                }
            }
            else{
                ++i;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        J26 obj = new J26();
        int[] arr = new int[]{1,1,1,1,2,2,3,3,3,4,5,5,6,6,7};
       System.out.print(obj.removeDuplicates(arr)); 
    }
}
