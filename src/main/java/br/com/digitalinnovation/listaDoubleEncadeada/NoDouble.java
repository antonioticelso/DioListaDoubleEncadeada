package br.com.digitalinnovation.listaDoubleEncadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoDouble<T> {
    private T conteudo;
    private NoDouble<T> noProximo;
    private NoDouble<T> noPrevio;

    public NoDouble(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }

}
