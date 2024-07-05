package lab02;
public class Entrada1 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo

    public static void main(String[] args) {

        var aresta = Double.parseDouble(args[0]);
        var volume = Math.pow(aresta, 3);
        System.out.println("Cubo" + args[0] );

        var lado1 = Double.parseDouble(args[0]);
        var lado2 = Double.parseDouble(args[1]);
        var lado3 = Double.parseDouble(args[2]);
        var volume2 = lado1*lado2*lado3 ;
        System.out.println("PARALELEPIPEDO " + args[volume2] );
    }
}
