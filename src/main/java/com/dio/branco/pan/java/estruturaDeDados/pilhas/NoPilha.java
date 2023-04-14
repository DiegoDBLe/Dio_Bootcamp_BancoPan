package com.dio.branco.pan.java.estruturaDeDados.pilhas;

public class NoPilha {

    private int dado;
    private NoPilha noPilha;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getNoPilha() {
        return noPilha;
    }

    public void setNoPilha(NoPilha noPilha) {
        this.noPilha = noPilha;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
