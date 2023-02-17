/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Carlos
 */
public class Perro implements Animal {
    public int edad;
    public String nombre;
    
    public Perro(int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
        
    }
    @Override
    public void dormir(){
        System.out.println("El Perro duerme en las noches");
    }
    @Override
    public void sonido(){
        System.out.println("Guau Guau");
    }
    @Override
    public void comer(){
        System.out.println("El perro come croquetas");
    }
    @Override
    public void edad_humana(){
        System.out.println(edad*7);
    }
    @Override
    public void edad(){
        System.out.println(EDAD);
    }
}
