package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void assercaoAgrupada() {
        Pessoa pessoa = new Pessoa("Luan", "Costa");

        assertAll("Asserções de pessoa",
                () -> assertEquals("Luan", pessoa.getNome()),
                () -> assertEquals("Costa", pessoa.getSobrenome())
                );
    }

}