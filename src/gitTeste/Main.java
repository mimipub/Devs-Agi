package gitTeste;

import static gitTeste.Main.Calculadora.soma;

public class Main {

    public class Calculadora{
        public static int soma(int a, int b){
            return a+b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Resultado:" + soma(5,3));
    }
}
