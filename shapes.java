import java.util.Scanner;

public class shapes{
  public static void main(String[] args) {

    int n=9;
    int x=n/2 +1;

    for(int i=1; i<=n; i++){

      for(int j=1; j<=x; j++){

        if( j==1 || j==x){
        System.out.print("* ");
        }
        else{
        System.out.print(" ");
        }
      }

      if( i<=n/2){
        x--;
      }
      else{
        x++;
      }

      System.out.println();
    }
  }



}