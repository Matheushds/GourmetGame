package domain;

public abstract class GeradorDeNos {

    public static  No geradorDeNos(Alimento alimento) {
        return new No(alimento);
    }
}
