import java.util.Scanner;

public class MainClass
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();

    int arr[]=new int[n];

    int sum=0;
    for (int i=0;i<arr.length;i++)
    {
      arr[i]=in.nextInt();
      sum+=arr[i];
    }


    if(sum%2>0)
    {
      System.out.println("NO");
    }
    else
    {
      int count=0;
      for (int i=0;i<arr.length;i++)
      {
        if(arr[i]%2!=0)
        {
          arr[i]+=1;
          arr[i+1]+=1;
          count+=2;
        }
      }
      System.out.println(count);
    }
  }


}
