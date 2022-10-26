public class Coche {
    private int velocidade;

    public Coche(){
        velocidade = 0;
    }

    public void acelerar(int valor){
        velocidade += valor;
    }

    public void frenar (int menos){
        velocidade -= menos;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade (int velocidade) {
        this.velocidade = velocidade;
    }
}
