package com.dio.branco.pan.java.estruturaDeDados.pilhas;

public class Pilhas {

    private NoPilhas referenciaNoPilhas;

    public Pilhas() {
        this.referenciaNoPilhas = null;
    }

    public void push(NoPilhas pilhas) {
        NoPilhas auxPilhas = referenciaNoPilhas;
        referenciaNoPilhas = pilhas;
        referenciaNoPilhas.setNoPilhas(auxPilhas);
    }

    public NoPilhas pop(){
        if(!this.isEmpty()){
            NoPilhas auxPilhaspop = referenciaNoPilhas;
            referenciaNoPilhas = referenciaNoPilhas.getNoPilhas();
            return auxPilhaspop;
        }
        return null;
    }

    public boolean isEmpty(){
        return this.referenciaNoPilhas == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "--------------------------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += "--------------------------------\n";

        NoPilhas noPilhaAuxiliar = referenciaNoPilhas;

        while (true){
            if (noPilhaAuxiliar != null){
                stringRetorno += "[No{dado=" + noPilhaAuxiliar.getDados()+ "}]\n";
                noPilhaAuxiliar = noPilhaAuxiliar.getNoPilhas();
            }else {
                break;
            }
        }
        stringRetorno += "--------------------------------\n";
        return stringRetorno;
    }
}
