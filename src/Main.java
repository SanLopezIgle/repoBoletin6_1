public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.setVelocidade(120);
        coche1.acelerar(20);
        System.out.println("Velocidade: " + coche1.getVelocidade());
        coche1.frenar(40);
        System.out.println("velocidade: " + coche1.getVelocidade());
    }
}