package gitTeste;

import static gitTeste.Main.Calculadora.soma;
import static gitTeste.Main.Calculadora.subtração;

public class Main {

    public class Calculadora{
        public static int soma(int a, int b){
            return a+b;
        }
    public static int subtração(int a, int b){
            return a - b;
    }
    }

    public static void main(String[] args) {
        System.out.println("Resultado:" + soma(5,3));
        System.out.println("Resultado da subtração:" + subtração(5,3));
    }
}
