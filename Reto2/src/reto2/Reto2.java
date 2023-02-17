/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;
import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        int day;
        System.out.println("Escoga entre 1 y 7");
        day=sd.nextInt();
            switch (day) {
              case 1:
                System.out.println("Monday");
                break;
              case 2:
                System.out.println("Tuesday");
                break;
              case 3:
                System.out.println("Wednesday");
                break;
              case 4:
                System.out.println("Thursday");
                break;
              case 5:
                System.out.println("Friday");
                break;
              case 6:
                System.out.println("Saturday");
                break;
              case 7:
                System.out.println("Sunday");
                break;
            }
    }
}
