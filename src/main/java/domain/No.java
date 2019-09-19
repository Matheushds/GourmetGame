package domain;

public class No {

    private Alimento noAtual;
    private No noAEsquerda;
    private No noADireita;

    public No(Alimento noAtual) {
        this.noAtual = noAtual;
    }

    public Alimento getNoAtual() {
        return noAtual;
    }

    public void setNoAtual(Alimento noAtual) {
        this.noAtual = noAtual;
    }

    public No getNoAEsquerda() {
        return noAEsquerda;
    }

    public void setNoAEsquerda(No noAEsquerda) {
        this.noAEsquerda = noAEsquerda;
    }

    public No getNoADireita() {
        return noADireita;
    }

    public void setNoADireita(No noADireita) {
        this.noADireita = noADireita;
    }
}
