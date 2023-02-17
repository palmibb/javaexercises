package prueba_restaurante;
import java.util.ArrayList;

public class Restaurante {
    public ArrayList<Integer> tipos_productos(ArrayList<Integer> products){
        ArrayList<Integer> resultado = new ArrayList<>();
        for (Integer i:products){
            if(!resultado.contains(i)){
                resultado.add(i);
            }
        }
        return resultado;
    }
    public ArrayList<Integer> productosfaltantes(ArrayList<Integer> products, ArrayList<Integer> no_tiene, Integer cate){
       ArrayList<Integer> resultado=new ArrayList<>();
       for(Integer i:products){
           if(no_tiene.get(i)==cate){
               resultado.add(i);
           }
       }
       return resultado;
    }
    public ArrayList<Integer> novendo(ArrayList<Integer> ListaA, ArrayList<Integer> ListaB){
        
        ArrayList resultado= new ArrayList<>();
        for (Integer i:ListaA){
            if (!ListaB.contains(i)){
                resultado.add(i);
            }
        }
        return resultado;
    }
    public Integer cambio(ArrayList<Integer> ListaDuplicateA, ArrayList<Integer> ListaDuplicateB){
        ArrayList<Integer> ListaA = new ArrayList<>();
        ArrayList<Integer> ListaB = new ArrayList<>();
        for (Integer i:ListaDuplicateA){
            if(!ListaDuplicateB.contains(i)){
                ListaA.add(i);
            }
        }
        for(Integer i:ListaDuplicateB){
            if(!ListaDuplicateA.contains(i)){
                ListaB.add(i);
            }
        }
        Integer TListaA=ListaA.size();
        Integer TListaB=ListaB.size();
        
        if(TListaA<=TListaB){
            return TListaA;
        }else{
            return TListaB;
        }
    }
}