package com.spessoa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spessoa.modelo.instrumento.corda.Guitarra;
import com.spessoa.modelo.instrumento.corda.Violao;
import org.junit.Before;
import org.junit.Test;

public class ViolaoTest {

  Violao violao;
  long numF = 12345;
  String marca = "Gibson";

  @Before
  public void antes(){
    violao = new Violao();
    violao.setNumeroLoteFabricacao(numF);
    violao.setMarca(marca);
  }

  @Test
  public void somViolao() {
    assertEquals("Som de Violão", violao.emitirSom());
  }

  @Test
  public void somDistorcidoViolao() {
    assertEquals("Som distorcido de Violão", violao.emitirSomDistorcido());
  }

  @Test
  public void testeatributosViolao() {
    assertEquals(numF, violao.getNumeroLoteFabricacao());
    assertEquals(marca, violao.getMarca());
  }

}
