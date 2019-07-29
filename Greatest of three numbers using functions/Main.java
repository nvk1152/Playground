import java.util.Scanner;
class Main{
  public static int greatest(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int max=greatest(n1,n2);
      max=greatest(n3,max);
      System.out.print(max);
	}
}