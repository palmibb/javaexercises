
package w3school;
import java.util.Scanner;

public class W3school {

    
    public static void main(String[] args) {
      Scanner first=new Scanner(System.in);
      int x;
      int y;
      System.out.println("Ingrese valor x: ");
      x=first.nextInt();
      System.out.println("Ingrese valor y: ");
      y=first.nextInt();
      if (x == y){
          System.out.println("iguales");
        } else if(x > y){
            System.out.println(x + " es mayor que " + y);
      }
        else{
            System.out.println(x + " es menor que " + y);
        }
    }
    
}
