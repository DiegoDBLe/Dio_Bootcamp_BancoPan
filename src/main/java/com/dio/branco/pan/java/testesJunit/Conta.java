package com.dio.branco.pan.java.testesJunit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Conta {

    private String numeroConta;

    private int saldo;
}
