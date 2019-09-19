package domain;

public class Alimento {

    private String nome;
    private boolean tipoCaracteristica;

    public Alimento (String nome, boolean tipoCaracteristica) {
        this.nome = nome;
        this.tipoCaracteristica = tipoCaracteristica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTipoCaracteristica() {
        return tipoCaracteristica;
    }

    public void setTipoCaracteristica(boolean tipoCaracteristica) {
        this.tipoCaracteristica = tipoCaracteristica;
    }
}
