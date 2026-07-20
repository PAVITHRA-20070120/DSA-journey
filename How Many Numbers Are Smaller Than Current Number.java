import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int inc=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    inc++;
                }
            }
            count[i]=inc;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of elements in array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] result=smallerNumbersThanCurrent(nums);
       
        System.out.println(Arrays.toString(result));
        
    }
}
