package br.com.digitalinnovation.listaEmArvore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NoBin<T extends Comparable<T>> {

    private T conteudo;
    private NoBin<T> noEsq;
    private NoBin<T> noDir;

    public NoBin(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }

}
