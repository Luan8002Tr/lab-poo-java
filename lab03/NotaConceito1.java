package lab03;

import java.util.Scanner;

public class NotaConceito1 {
    public static void main(String[] args) {
 
        var sc = new Scanner(System.in);
        System.out.println("Digete a nota (0-100): ");
        var nota = sc.nextInt();

        if ( nota >= 91 && nota <=100 ) {
            System.out.println("A");
        }
        else if ( nota >= 81 && nota <= 90 ) {
            System.out.println("B");
        }
        else if ( nota >= 71 && nota <= 80 ) {
            System.out.println("c");
        }
        else {
            System.out.println("Nota fora do intervalo!");
        }







    }
}