package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SaudacaoUtilTest {

    @Test
    public void Dado_horario_matuino_Quando_saudar_Entao_deve_retornar_bom_dia() {
        int horaValida = 9;
        String saudacao = saudar(horaValida);
        assertEquals("Bom dia", saudacao);
    }

    @Test
    public void Dado_um_horario_vespertino_Quando_saudar__Entao_deve_retornar_boa_tarde() {
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde", saudacao);
    }

    @Test
    public void Dado_um_horario_noturno_Quando_saudar_Entao_deve_retornar_boa_noite() {
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite", saudacao);
    }

    @Test
    public void Dado_uma_hora_invalida_Quando_saudar_entao_deve_lancar_exception() {
        int horaInvalida = -10;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> saudar(horaInvalida));
        assertEquals("Hora inválida", ex.getMessage());
    }

    @Test
    public void Dado_uma_hora_valida_Quando_saudar_Entao_nao_deve_lancar_exeption() {
        int horaValida = 0;
        assertDoesNotThrow(()-> saudar(horaValida));
    }

}