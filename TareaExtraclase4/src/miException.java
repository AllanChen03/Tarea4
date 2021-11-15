import java.util.HashMap;
import java.util.Map;

public class miException{
    public static class producto extends Exception{

        private int codigoError;

        public producto(int codigoError) {
            super();
            this.codigoError = codigoError;


        }
        @Override
        public String getMessage(){
            String msj = "";
            switch(codigoError){
                case 1:
                    msj = "El numero ";
                    break;
                case 2:
                    msj = "Error, es un numero Impar";
                    break;
            }
            return msj;


        }


        public static void main(String[] args){
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("Tele", 2);
            map.put("Celulares", 1);
            map.put("Sarten", 0);
            try{
                if (map.get("Sarten") == 0);
                throw new miException.producto(1);




                } catch (excepcion ex) {
                System.out.println(ex.getMessage());
            }

        }

        }
    }
}
