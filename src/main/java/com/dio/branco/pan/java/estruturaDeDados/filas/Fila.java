package com.dio.branco.pan.java.estruturaDeDados.filas;
/*
 FIFO (First in First Out) Primeiro a entrar e primeiro a sair.
 Fila
* */
public class Fila<T> {

    private NoFila<T> referenciaNoFila;

    public Fila() {
        this.referenciaNoFila = null;
    }

    /* Recebi o novoNoFila -> entrou na fila, a referencia do novoNoFila era o antigo no da fila referenciaNoFila
     ou seja o ultimo no não é mais o ultimo é o penultimo e o novoNoFila passa a ser o ultimo da fila.*/
    public void enqueue(T object){
        NoFila novoNoFila = new NoFila(object);
        novoNoFila.setRefNoFila(referenciaNoFila);
        referenciaNoFila = novoNoFila;
    }

    /* Retorna o primeiro da fila, ou seja o primeiro que chegou na fila:
     se a fila estiver nao estiver vazia: o primeiroNo recebe a referenciaNoFila,
     se so tiver apenas um na fila ele retorna esse um, mas se tiver mais de um como que ele vai saber?
     por isso do loop, enquanto verdade, se o primeiro da fila que é a referencia nao tiver alguma coisa, ou seja
     não for null o primeiro da fila recebe a referencia de primeiro.
     se não parar o loop pois ele nao tem tem mais nó na fila.*/
    public T first(){
        if (!this.isEmpty()) {
            NoFila primeiroNo = referenciaNoFila;
            while (true){
                if(primeiroNo.getRefNoFila() != null){
                    primeiroNo = primeiroNo.getRefNoFila();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!this.isEmpty()) {
            NoFila noAuxiliar = referenciaNoFila;
            NoFila primeiroNo = referenciaNoFila;
            while (true){
                if(primeiroNo.getRefNoFila() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNoFila();
                }else {
                    noAuxiliar.setRefNoFila(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return referenciaNoFila == null ? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliarFila = referenciaNoFila;

        if (referenciaNoFila != null) {
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliarFila.getObject() + "}]--->";
                if (noAuxiliarFila.getRefNoFila() != null){
                    noAuxiliarFila = noAuxiliarFila.getRefNoFila();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
