package sample;

import java.io.Serializable;

/**
 * Created by ton on 4/16/14.
 */

public class MinhaClasse implements Serializable {

    private String valor;

    private String teste;

    private MinhaClasse() {
    }

    public static MinhaClasse createMinhaClasse() {
        return new MinhaClasse();
    }


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {

        this.valor = valor;
    }


    public String getTeste() {
        return teste;
    }


    public void setTeste(String teste) {
        this.teste = teste;
    }




}
