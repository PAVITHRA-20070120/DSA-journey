import java.util.Scanner;
class Solution {
    public static void moveZeroes(int[] nums) {
        int insertpos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[insertpos]=nums[i];
                insertpos++;
            }
        }
        for(int i=insertpos;i<nums.length;i++)
        {
           nums[i]=0;
        }
        

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        moveZeroes(nums);
    }
}
