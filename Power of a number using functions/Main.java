import java.util.Scanner;
class Main{
  public static int power(int b,int e)
  {
    int tot=1,t=1;
    while(t<=e)
    {
      tot*=b;
      t++;
    }
    return tot;
  }
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=power(a,b);
    System.out.print(c);
  }
}