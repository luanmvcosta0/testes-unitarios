package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste utilitarios de saudação")
class SaudacaoUtilTest {

    @Test
    @DisplayName("Deve saudar com bom dia")
    public void saudarComBomDia() {
        //Arrenge
        int horaValida = 9;

        //Act
        String saudacao = saudar(horaValida);

        //Assert
        assertEquals("Bom dia", saudacao);
    }

    @Test
    @DisplayName("Deve saudar com boa tarde")
    public void saudarComBoaTarde() {
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde", saudacao);
    }

    @Test
    @DisplayName("Deve saudar com boa noite")
    public void saudarComBoaNoite() {
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite", saudacao);
    }

    @Test
    @DisplayName("Deve lançar uma Exception")
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