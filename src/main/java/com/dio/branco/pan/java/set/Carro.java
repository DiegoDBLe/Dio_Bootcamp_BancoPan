package com.dio.branco.pan.java.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@Data
@ToString
@AllArgsConstructor
public class Carro implements Comparable<Carro> {

    private String marca;

//    @Override
//    public int compareTo(Carro carro) {
//        // Ordem de tamanho da String
//        if(this.marca.length() < carro.marca.length()){
//            return -1;
//        }else if(this.marca.length() > carro.marca.length()){
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Carro carro) {
        //Ordenando por ordem alfabetica:
        return this.getMarca().compareTo(carro.marca);
    }
}
