/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Carlos
 */
public interface Animal {
    String NOMBRE="";
    int EDAD=0;
    public void sonido();
    public void comer();
    public void dormir();
    public void edad_humana();
    default public void edad(){
        System.out.println(EDAD);
    }
}
