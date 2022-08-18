package com.spessoa.test;

import static org.junit.jupiter.api.Assertions.*;

import com.spessoa.modelo.instrumento.corda.Guitarra;
import org.junit.Before;
import org.junit.Test;

class GuitarraTest {

  Guitarra guitarra;
  int numCorda = 5;
  long numF = 12345;
  String marca = "Gibson";

  @Before
  public void antes(){
    guitarra = new Guitarra();
    guitarra.setNumeroCordas(numCorda);
    guitarra.setNumeroLoteFabricacao(numF);
    guitarra.setMarca(marca);
  }

  @Test
  public void somGuitarra() {
    assertEquals("Som de guitarra", guitarra.emitirSom());
  }

  @Test
  public void somDistorcidoGuitarra() {
    assertEquals("Som distorcido de guitarra", guitarra.emitirSomDistorcido());
  }

  @Test
  public void testeatributosGuitarra() {
    assertEquals(numCorda, guitarra.getNumeroCordas());
    assertEquals(numF, guitarra.getNumeroLoteFabricacao());
    assertEquals(marca, guitarra.getMarca());
  }

}