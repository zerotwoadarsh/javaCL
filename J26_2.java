import java.util.Arrays;

public class J26_2 {
    public int removeDuplicates(int[] nums) {
        int count = 0,c=0;
        for (int i = 0; i < nums.length-1; ++i){
            if (nums[i] == nums[i+1] ){
                ++count;
                continue;
            }
            else{
                nums[count] = nums[i];
                
            }
        }
        // nums[c] = nums[nums.length-1];
        return count;
    }
    public static void main(String[] args) {
        J26_2 obj1 = new J26_2();
        int[] arr = new int[]{1,1,2};
       System.out.println(obj1.removeDuplicates(arr)); 
System.out.print(Arrays.toString(arr));
    }
}