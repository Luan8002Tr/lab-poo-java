package lab02;
public class VolumeParalelepipedo{
    public static void main(String[] args) {
        var base = Float.parseFloat(args[0]);
        var altura = Float.parseFloat(args[1]);
        var largura = Float.parseFloat(args[2]);
        var volume = base * altura * largura;

        System.out.println("O volume para este paralelepipedo é:" + volume);
    }

}