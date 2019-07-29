import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n;
      int sum=0;
      while(n>0)
      {
        int ld=n%10;
        sum=sum+(ld*ld*ld);
        n=n/10;
      }
      if(sum==a)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}