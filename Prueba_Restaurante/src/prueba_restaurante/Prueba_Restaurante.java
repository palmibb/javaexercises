package prueba_restaurante;
import java.util.ArrayList;


public class Prueba_Restaurante {

    
    public static void main(String[] args) {
        Restaurante obj = new Restaurante();
        ArrayList arr = new ArrayList<>();
        
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(5);
        arr.add(5);  
        System.out.println(obj.tipos_productos(arr));
        }
}
