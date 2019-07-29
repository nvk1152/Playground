import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int x=n*n;
    return x;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int ans=square(n);
      System.out.print(ans);
	} 
}