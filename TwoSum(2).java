class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=0;
        }
        System.out.println("Enter the target sum:");
        int target=sc.nextInt();
        int[] arr=twoSum(nums,target);
        


    }
}
