import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    int i=2;
    while(i<=n)
    {
      if((i%2!=0 && i%3!=0) || (i/2==1) || ((float)i/3==1))
        System.out.println(i);
      i++;
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
}