class Solution {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]!=arr[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        boolean result=isPalindrome(str);
        System.out.println(result);
    }
}
