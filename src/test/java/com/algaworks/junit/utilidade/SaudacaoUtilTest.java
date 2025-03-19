package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudarComBomDia() {
        //Arrenge
        int horaValida = 9;

        //Act
        String saudacao = saudar(horaValida);

        //Assert
        assertEquals("Bom dia", saudacao);
    }

    @Test
    public void saudarComBoaTarde() {
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde", saudacao);
    }

    @Test
    public void saudarComBoaNoite() {
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite", saudacao);
    }

    @Test
    public void deveLancarException() {
        int horaInvalida = -10;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> saudar(horaInvalida));
        assertEquals("Hora inválida", ex.getMessage());
    }

    @Test
    public void naoDeveLancarException() {
        int horaValida = 0;
        assertDoesNotThrow(()-> saudar(horaValida));
    }

}