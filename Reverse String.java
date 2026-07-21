import java.util.Scanner;
class Solution {
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }


    }
    public static void main(String[] args)
    {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        reverseString(arr);
    }
}
