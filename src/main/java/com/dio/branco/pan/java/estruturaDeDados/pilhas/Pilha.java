package com.dio.branco.pan.java.estruturaDeDados.pilhas;

/*
    Pilhas: [LIFO: Last in, First Out]
    ou seja ultimo a entrar e primeiro a sair.
* */
public class Pilha {

    private NoPilha referenciaNoPilha;

    public Pilha() {
        this.referenciaNoPilha = null;
    }

    // Método que coloca um no topo da pilha
    public void push(NoPilha novoNoPilha) {
        NoPilha noPilhaAuxiliar = referenciaNoPilha;
        referenciaNoPilha = novoNoPilha;
        referenciaNoPilha.setNoPilha(noPilhaAuxiliar);

    }

    // metodo pop que pega o primeiro da fila e exclui.
    public NoPilha pop(){
        if(!this.isEmpty()){
            NoPilha noPilhaPop = referenciaNoPilha;
            referenciaNoPilha = referenciaNoPilha.getNoPilha();
            return noPilhaPop;
        }
        return null;
    }

    // Retorna o primeiro da fila sem excluir
    public NoPilha top(){
        return referenciaNoPilha;
    }

    //Verifica se a pilha está vazia.
    public boolean isEmpty(){
        return referenciaNoPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "--------------------------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += "--------------------------------\n";

        NoPilha noPilhaAuxiliar = referenciaNoPilha;

        while (true){
            if (noPilhaAuxiliar != null){
                stringRetorno += "[No{dado=" + noPilhaAuxiliar.getDado()+ "}]\n";
                noPilhaAuxiliar = noPilhaAuxiliar.getNoPilha();
            }else {
                break;
            }
        }
        stringRetorno += "--------------------------------\n";
        return stringRetorno;
    }
}
