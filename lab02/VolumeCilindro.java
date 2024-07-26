package lab02;
import java.util.Scanner;

public class VolumePiramide{
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        System.out.println("Informe o raio:");
        var raio = sc.nextInt();


        System.out.println("Informe a altura:");
        var altura = sc.nextInt();

        var pi = 3.14;

        var volume = pi * raio * raio * altura;
        System.out.println("O volume para seu cilindro:" + volume );
    }

}