import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestConvertic {
    //ejercicio de clase
    @Test
    @DisplayName("suma de dos numeros enteros")
    public void sumTwoIntegersCompleted() {
        //arrange
        int a = 1;
        Integer b = 39;
        //act
        int result = Convertic.sumIntegers(a, b);
        //assert
        Assertions.assertEquals(40, result);
    }

    @Test
    @DisplayName("sum test failled with Iinteger")
    public void sumTwoInteerstFailled() {
        int v = 1;
        Integer d = null;

        //act
        //int result=Convertic.sumIntegers(s,d);

        //assert&&assert
        Assertions.assertThrows(NullPointerException.class, () -> Convertic.sumIntegers(v, d));
    }
    //ejercicio de producto de dos numeros enteros
    @Test
    @DisplayName("producto de dos numeros enteros")
    public void prodTwoIntegersCompleted() {
        //arrange
        int a = 5;
        Integer b = 4;
        //act
        int result = Convertic.prodIntegers(a, b);
        //assert
        Assertions.assertEquals(20, result);
    }

    @Test
    @DisplayName("sum test failled with Iinteger")
    public void prodTwoInteerstFailled() {
        int v = 1;
        Integer d = null;

        //act
        //int result=Convertic.sumIntegers(s,d);

        //assert&&assert
        Assertions.assertThrows(NullPointerException.class, () -> Convertic.prodIntegers(v, d));
    }

    //ejercicio de convertir una cadena a texto
    @Test
    @DisplayName("sum test failled with Iinteger")
    public void textToUpperCase() {
        String texto = "colombia";


        //act
        String result = Convertic.stringUpperCase(texto);
        System.out.println("texto " + texto);

        //Assert &&assert
        Assertions.assertEquals("COLOMBIA", result);
    }


    @Test
    @DisplayName("sum test failled with Iinteger")
    public void textToUpperCaseFailled() {
        String texto = "colombia";


        //act
        //String result = Convertic.stringUpperCase(texto);
        //System.out.println("texto " + texto);

        //Assert &&assert
        Assertions.assertThrows(IllegalArgumentException.class,()->Convertic.stringUpperCase(texto));
    }

}
