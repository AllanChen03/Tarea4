public class ExcepcionPropia {
    public static class excepcion extends Exception{
        private int codigoError;

        public excepcion(int codigoError){
            super();
            this.codigoError = codigoError;
        }
        @Override
        public String getMessage(){
            String msj = "";
            switch(codigoError){
                case 1:
                    msj = "Error, es un numero Par";
                    break;
                case 2:
                    msj = "Error, es un numero Impar";
                    break;
            }
            return msj;


        }

        public static void main(String[] args) {

            int num;

            try {

                num = 5;

                if (num%2 == 0 ) {
                    throw new excepcion(1);
                } else{
                    throw new excepcion(2);
                }

            } catch (excepcion ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

}
