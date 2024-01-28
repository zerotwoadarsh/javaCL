public class J1752_2 {
    public boolean check(int[] nums) {
        int count = 0;

        for ( int i = 0; i < nums.length-1; ++i){
            if(nums[i] >= nums[i+1]){
                ++count; 
            }
        }
        if (nums[0] <= nums[nums.length-1]){
            ++count;
        }
        return count <=1;
    }
    public static void main(String[] args) {
        int [] nums = new int[] { 3,4,5,1,2,3,4,5 };
        J1752_2 obj = new J1752_2();
        System.out.print(obj.check(nums));
        
    }
}
