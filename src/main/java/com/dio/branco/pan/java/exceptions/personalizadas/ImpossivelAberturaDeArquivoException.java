package com.dio.branco.pan.java.exceptions.personalizadas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@ToString
public class ImpossivelAberturaDeArquivoException  extends Exception{

    private String nomeDoAqruivo;
    private String diretorio;


}
