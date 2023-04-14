package com.dio.branco.pan.java.listaEncadeada;

public class ListaEncadeada<T> {

    private NoLista<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null? true:false;
    }

    public int size(){
        int tamanhoLista = 0;

        NoLista<T> referenciaAux = referenciaEntrada;
        while (true) {
            if(referenciaAux != null){
                tamanhoLista ++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        NoLista<T> novoNo = new NoLista<>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        NoLista<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoLista<T> getNo(int index){
        validaIndice(index);
        NoLista<T> noAuxiliar = referenciaEntrada;
        NoLista<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){

        NoLista<T> noPivor = this.getNo(index);
        if (index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        NoLista<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    private void validaIndice(int index) {
        if (index >= size()){
            int tamanhoLista = size() -1;
            throw new IndexOutOfBoundsException("Index not found\nThis List size " + tamanhoLista );
        }
    }

    @Override
    public String toString() {
        String strRetorno = " ";
        NoLista<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
