import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int s1=in.nextInt();
      int s2=in.nextInt();
      int a=-1,t=-1;
      for(int i=0;i<n;i++)
      {
        if(s1==arr[i])
        {
          a=i;
        }
        if(s2==arr[i])
        {
          t=i;
        }
      }
      if(a!=-1 || t!=-1)
      {
        System.out.print(a+"\n"+t);
      }
      else
        System.out.print(a+"\n"+t);
    }
}