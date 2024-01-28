public class J1752 {
    public boolean check(int[] nums) {
        
        int s = 0, l = nums.length-1;

        while (nums[s] <= nums[s+1] && s < (nums.length-2)){
            ++s;
        }
        while (nums[l-1] <= nums[l] && l != 1){
            --l;
        }
        s+=1;
        l-=1;
        System.out.print(l + "" + s);
        // System.out.print(l==s);
        if ( l == 0 && s == nums.length-1 || l == s)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        int [] nums = new int[] { 3,4,5,1,2 };
        J1752 obj = new J1752();
        System.out.print(obj.check(nums));
        
    }
}
