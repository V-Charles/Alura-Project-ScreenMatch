package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {

    /*
    * atributos
    * */
    private int tempoTotal;

    /*
    * getters and setters
    * */
    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
