import java.util.Scanner;
import java.util.Arrays; 
class Solution {
    public static int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                return i;
            }
            
        }
        return nums.length;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        int target;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        target=sc.nextInt();
        int result=searchInsert(nums,target);
        System.out.println(result);
    }
}
