package starter;

import domain.Alimento;
import domain.ArvoreDeDecisao;
import domain.GeradorDeNos;
import domain.No;

import javax.swing.*;

public class CriadorDoJogo {

    private JFrame frame = new JFrame();
    private ArvoreDeDecisao arvoreDeDecisao = new ArvoreDeDecisao(criarNoRaiz());
    private No raiz = criarNoRaiz();

    public No criarNoRaiz() {
        Alimento massa = new Alimento("Massa", true);
        Alimento boloDeChocolate = new Alimento("Bolo de Chocolate", false);
        Alimento lasanha = new Alimento("Lasanha", false);

        No noRaiz = GeradorDeNos.geradorDeNos(massa);
        noRaiz.setNoADireita(GeradorDeNos.geradorDeNos(lasanha));
        noRaiz.setNoAEsquerda(GeradorDeNos.geradorDeNos(boloDeChocolate));
        return noRaiz;
    }

    public void jogar() {
        JOptionPane
                .showConfirmDialog(frame,"Pense em uma comida que voce goste!",
                        "Gourmet Game",
                        JOptionPane.DEFAULT_OPTION);

        perguntar(raiz);
    }

    private void perguntar(No no) {

        int option = JOptionPane.showConfirmDialog(frame,
                "A comida que você pensou é " + no.getNoAtual().getNome(),
                "Gourmet Game", JOptionPane.YES_NO_OPTION);

        if(option == 0 && !no.getNoAtual().isTipoCaracteristica()){
            JOptionPane
                    .showConfirmDialog(frame,"Oba! Acertei de novo",
                            "Gourmet Game",
                            JOptionPane.DEFAULT_OPTION);
            jogar();
        }else if(option == 0 && arvoreDeDecisao.getRaiz().getNoADireita() != null) {
            perguntar(no.getNoADireita());
        }

        if (option == 1 && !no.getNoAtual().isTipoCaracteristica()){
            registraNovoPrato(no);
        }else {
            perguntar(no.getNoAEsquerda());
        }
    }

    private void registraNovoPrato(No no) {
        JOptionPane
                .showConfirmDialog(frame,"Desisto!",
                        "Gourmet Game",
                        JOptionPane.DEFAULT_OPTION);

        String novoPrato = JOptionPane.showInputDialog("Qual é o nome do prato?");
        String novaCaracteristica = JOptionPane.showInputDialog("O que " + novoPrato + " é que " + no.getNoAtual().getNome() + " não é");

        arvoreDeDecisao.criarNovoNoParaArvore(novoPrato, novaCaracteristica, no);
        jogar();
    }
}
