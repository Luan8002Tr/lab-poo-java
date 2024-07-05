package lab02;
public class Entrada1 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo

    public static void main(String[] args) {

        var aresta = Double.parseDouble(args[0]);
        var volume = Math.pow(aresta, 3);
        System.out.println("Seu nome é " + args[0] );
        
    }
}
