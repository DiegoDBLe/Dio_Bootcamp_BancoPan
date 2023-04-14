package com.dio.branco.pan.java.arvores;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoArvore<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoArvore<T> novoNo = new NoArvore<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoArvore<T> inserir(NoArvore<T> atual, NoArvore<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsquerda(inserir(atual.getNoEsquerda(), novoNo));
        }else{
            atual.setNoDireita(inserir(atual.getNoDireita(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsquerda());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDireita());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsquerda());
            exibirPosOrdem(atual.getNoDireita());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoArvore<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsquerda());
            exibirPreOrdem(atual.getNoDireita());
        }
    }

    public void remover(T conteudo){
        try{
            NoArvore<T> atual = this.raiz;
            NoArvore<T> pai = null;
            NoArvore<T> filho = null;
            NoArvore<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsquerda();
                }else {
                    atual = atual.getNoDireita();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if(pai == null){
                if(atual.getNoDireita() == null){
                    this.raiz = atual.getNoEsquerda();
                }else if(atual.getNoEsquerda() == null){
                    this.raiz = atual.getNoDireita();
                }else {
                    for(temp = atual, filho = atual.getNoEsquerda();
                        filho.getNoDireita() != null;
                        temp = filho, filho = filho.getNoEsquerda()
                    ){
                        if(filho != atual.getNoEsquerda()){
                            temp.setNoDireita(filho.getNoEsquerda());
                            filho.setNoEsquerda(raiz.getNoEsquerda());
                        }
                    }
                    filho.setNoDireita(raiz.getNoDireita());
                    raiz = filho;
                }
            }else if(atual.getNoDireita() == null){
                if(pai.getNoEsquerda() == atual){
                    pai.setNoEsquerda(atual.getNoEsquerda());
                }else {
                    pai.setNoDireita(atual.getNoEsquerda());
                }
            }else if(atual.getNoEsquerda() == null){
                if(pai.getNoEsquerda() == atual){
                    pai.setNoEsquerda(atual.getNoDireita());
                }else {
                    pai.setNoDireita(atual.getNoDireita());
                }
            }else{
                for(
                        temp = atual, filho = atual.getNoEsquerda();
                        filho.getNoDireita() != null;
                        temp = filho, filho = filho.getNoDireita()
                ){
                    if(filho != atual.getNoEsquerda()){
                        temp.setNoDireita(filho.getNoEsquerda());
                        filho.setNoEsquerda(atual.getNoEsquerda());
                    }
                    filho.setNoDireita(atual.getNoDireita());
                    if(pai.getNoEsquerda() == atual){
                        pai.setNoEsquerda(filho);
                    }else{
                        pai.setNoDireita(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
