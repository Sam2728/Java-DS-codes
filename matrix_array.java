import java.util.*;
class sam
{
    public static void  main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int[][] arr=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
