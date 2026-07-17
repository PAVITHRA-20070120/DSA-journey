import java.util.Scanner;
class Solution {
    public static int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        runningSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
                runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
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
        int[] result=runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
