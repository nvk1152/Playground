import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int a[][]=new int[n][n];
      spiral(a,n);
      for(int i=0;i<n;i++)
      {  for(int j=0;j<n;j++)
           System.out.print(a[i][j]+" ");
       System.out.println();
      }
    }
  public static void spiral(int a[][], int n)
  {
    int i,t=1;
    int cmin=0,rmin=0,cmax=n-1,rmax=n-1;
    while((rmin <= rmax) && (cmin <= cmax)){
      for(i=cmax; i>=cmin; i--){
      a[rmin][i]=t++;}
    for(i=rmin+1; i<=rmax; i++){
      a[i][cmin]=t++;}
    for(i=cmin+1; i<=cmax; i++){
      a[rmax][i]=t++;}
    for(i=rmax-1; i>=rmin+1; i--){
      a[i][cmax]=t++;}
    rmin++;
    cmin++;
    rmax--;
    cmax--;
  }
}
}