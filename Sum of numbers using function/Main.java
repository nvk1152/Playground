import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int x=n*(n+1)/2;
    return x;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sum(n));
	}
}