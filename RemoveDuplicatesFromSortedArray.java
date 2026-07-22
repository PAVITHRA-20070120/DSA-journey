import java.util.Scanner;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
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
        int k=removeDuplicates(nums);
        System.out.println(k);
    }
}
