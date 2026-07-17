import java.util.Scanner;
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0,temp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            if(nums[i]!=1 || i==nums.length-1)
            {
                if(temp<count)
                {
                    temp=count;
                }
                count=0;
            }
        }
        return temp;
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
        int result=findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
