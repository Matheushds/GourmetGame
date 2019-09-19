package domain;

public class ArvoreDeDecisao {

    private No raiz;

    public ArvoreDeDecisao(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void criarNovoNoParaArvore(String nome, String caracteristica, No no) {

        Alimento atual = no.getNoAtual();
        Alimento novo = new Alimento(caracteristica, true);
        no.setNoAtual(novo);

        Alimento alimentoADireita = new Alimento(nome, false);

        No noADireita = GeradorDeNos.geradorDeNos(alimentoADireita);
        no.setNoADireita(noADireita);
        No noAEsquerda = GeradorDeNos.geradorDeNos(atual);
        no.setNoAEsquerda(noAEsquerda);
    }
}
