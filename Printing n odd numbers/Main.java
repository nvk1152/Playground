import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int t=0;
      int n=in.nextInt();
      for(int i=0;i<100;i++)
      {
        if(t==n)
          break;
        else
        {
          if(i%2!=0)
          {
            System.out.println(i);
            t++;
          }
        }
      }
	}
}