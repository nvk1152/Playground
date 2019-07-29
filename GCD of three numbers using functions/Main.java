import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    int min;
    if(a<b)
      min=a;
    else
      min=b;
    while(min>0)
    {
      if(a%min==0 && b%min==0)
        return min;
      min--;
    }
    return 0;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int hcf=gcd(n1,n2);
      hcf=gcd(n3,hcf);
      System.out.print(hcf);
	}
}