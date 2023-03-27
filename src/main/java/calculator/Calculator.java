package calculator;

public class Calculator {
        //ATTRIBUTES
        private float num1;
        private float num2;

    //CONSTRUCTOR
    private Calculator() {
    }

    //Scopo di questa esercitazione è di implementare i metodi di una semplice calcolatrice e di
            // scrivere una classe di test per verificare che funzionino come ci aspettiamo! Creare una classe chiamata Calculator avente i seguenti metodi pubblici :
            //- float add(float num1, float num2)
            //- float subtract(float num1, float num2)
            //- float divide(float num1, float num2)
            //- float multiply(float num1, float num2)
            //Creare in seguito una classe di test che abbia 4 metodi, ognuno per verificare il corretto
            // funzionamento di ogni metodo presente nella classe Calculator.

        //METHODS
        public static float add(float num1, float num2){
            return num1+num2;
        }

        public static float subtract(float num1, float num2){
            if(num1 >= num2){
                return num1 - num2;
            }else{
                return num2 - num1;
            }
        }

        public static float divide(float num1, float num2) throws ArithmeticException{
            if(num2 == 0){
                throw new ArithmeticException("impossible to divide by 0");
            }else{
                return num1 / num2;
            }
        }

        public static float multiply(float num1, float num2){
            return num1*num2;
        }

    }
