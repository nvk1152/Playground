import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int t=n;
      for(int i=n;i>0;i--)
      {
        for(int j=t;j>0;j--)
        {
          System.out.print(j);
        }
        t--;
        System.out.print("\n");
      }
	}
}