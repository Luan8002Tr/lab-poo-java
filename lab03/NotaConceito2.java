package lab03;

import java.util.Scanner;

public class NotaConceito2 {
    public static void main(String[] args) {
 
        var sc = new Scanner(System.in);
        System.out.println("Digiti a letra (A - F): ");
        var nota = sc.next();

        switch (nota){
            case "A" -> System.out.println("100");
            case "B" -> System.out.println("90");
            case "C" -> System.out.println("80");
            case "D" -> System.out.println("70");
            case "E" -> System.out.println("60");
            case "F" -> System.out.println("50");
            default -> System.out.println("Nota fora do intervalo.");
        }



    }
}

