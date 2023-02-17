/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;
import java.util.Scanner;

public class Polimorfismo {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Edad: ");
        int edad=sc.nextInt();
        Perro miperro=new Perro(edad,nombre);
        miperro.comer();
        miperro.dormir();
        miperro.edad();
        miperro.edad_humana();
        miperro.sonido();
    }
    
}
