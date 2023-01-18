import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convertic {

    public static int sumIntegers(int x, int y) {
        return x + y;
    }

    public static int prodIntegers(int x, int y) {
        return x * y;
    }

    public static String stringUpperCase(String cadena) {
        return cadena.toUpperCase();
    }
    public static int listaNumeros(int a,int b, int c,int d,int e){
        List<Integer> num=Arrays.asList(a,b,c,d,e);
        int mayor=Integer.MIN_VALUE;

        for(int numero:num){
            if(numero>mayor){
                mayor=numero;
            }
        }
        return mayor;
    }

}
