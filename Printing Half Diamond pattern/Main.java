import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=i;j<=(n-1);j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}