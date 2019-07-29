import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int t=n;
      int temp=0;
      int a=1;
      int sd;
      while(t>0)
      {
        t=t/10;
        temp=temp+1;
        if(temp>2)
          a=a*10;
      }
       sd=(n/a)%10;
      
      System.out.println(sd);
	}
}