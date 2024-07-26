package lab03;

import java.util.Scanner;

public class Condicionais3 {
    // Execute no terminal
    // java lab03/Condicionais4.java
    public static void main(String[] args) {
        /**
         * O switch em Java é uma estrutura de controle que permite avaliar a igualdade
         * de uma variável ou expressão com uma lista de valores possíveis (case) e
         * executar um bloco de código correspondente ao valor que coincide.
         * 
         */
        var sc = new Scanner(System.in);
        System.out.println("Digite o material do seu resíduo:");
        String copo = sc.next();
        switch (copo) {
            case "comida":
            case "bebida":
                System.out.println("Jogue na lixeira marrom");
                break;
            case "plástico":
                System.out.println("Jogue na lixeira vermelha");
                break;
            case "metal":
                System.out.println("Jogue na lixeira amarelo");
                break;
            case "vidro":
                System.out.println("Jogue na lixeira verde");
                break;
            default:
                System.out.println("Material desconhecido, verifique sua lixeira local.");
                break;
        }

        sc.close();
    }
}
