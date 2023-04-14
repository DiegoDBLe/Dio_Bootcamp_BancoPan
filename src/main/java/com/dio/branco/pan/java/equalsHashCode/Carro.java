package com.dio.branco.pan.java.equalsHashCode;

import lombok.Data;

import java.util.Objects;

@Data
public class Carro {

    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
