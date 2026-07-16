import java.util.Scanner;
class Solution {
    public static int maximumWealth(int[][] account) {
        
        int max=0;
        for(int i=0;i<account.length;i++)
        {
            int sum=0;
             for(int j=0;j<account[i].length;j++)
             {
                sum+=account[i][j];
             }
             if(sum>=max)
             {
                max=sum;
             }
        }
        return max;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO of customers and wealth");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] account =new int[m][n];
        
        System.out.println("Enter customer id and wealth");
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                  account[i][j]=sc.nextInt();
             }
        }
        int max=maximumWealth(account);
        System.out.println(max);

    }


}
