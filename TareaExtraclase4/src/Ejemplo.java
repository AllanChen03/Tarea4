import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo {

    //Try: Comprueba las excepciones
    public static void Try() {
        int[] lista = new int [1];
        try{ //Comprueba las excepciones
            lista[2] = 2;


        } catch(ArrayIndexOutOfBoundsException exception){ //Captura las excepciones
            System.out.println("Error en el indice");


        }


    }
    //Throw: Crea excepciones
    public  static void Throw(){
        int divisor = 0;
        int dividendo = 2;
        try {
            if (divisor == 0) ;
            throw new ArithmeticException("El divisor no puede ser 0"); //Lanza una excepcion

        } catch (ArithmeticException exception){
            System.err.println(exception);
        }

    }
    //Finally: No importa lo que suceda en el try/catch, el finally se ejecuta de todas formas
    public static void Finally(){

        int divisor = 0;
        int dividendo = 10;
        try {
            if (divisor == 0) ;


        } catch (ArithmeticException exception){
            System.err.println(exception);
        } finally{
            divisor = 2;
            System.out.println(dividendo/divisor);
        }



    }

    public static void main(String[] args){
        Try();
        Throw();
        Finally();



    }
}
