package com.spessoa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spessoa.modelo.instrumento.corda.Guitarra;
import com.spessoa.modelo.instrumento.piano.Armario;
import com.spessoa.modelo.instrumento.piano.EfeitoSonoro;
import com.spessoa.modelo.instrumento.piano.Piano;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PianoTest {

  Piano piano;
  long numF = 12345;
  String marca = "PianoShow";
  int numTeclas = 22;
  int numPedais = 7;
  boolean digital = true;
  Armario armario = new Armario();

  ArrayList<EfeitoSonoro> efeitoSonoros = new ArrayList<>();
  EfeitoSonoro es = new EfeitoSonoro();

  @Before
  public void antes(){
    piano = new Piano();
    es.setEfeitoSonoro("Efeito estranho");
    piano.adicionarEfeitoSonoro(es);
    piano.setDigital(digital);

    armario.setTipoMadeira("Normal");
    piano.setArmario(armario);

    piano.setNumeroTeclas(numTeclas);
    piano.setNumeroPedais(numPedais);
    piano.setNumeroLoteFabricacao(numF);
    piano.setMarca(marca);
  }

  @Test
  public void somPiano() {
    assertEquals("Som de Piano", piano.emitirSom());
  }

  @Test
  public void testeatributosPiano() {
    assertEquals(digital, piano.getDigital());
    assertEquals("Normal", piano.getArmario().getTipoMadeira());
    assertEquals("Efeito estranho", piano.getEfeitoSonoros().get(0).getEfeitoSonoro());
    assertEquals(numF, piano.getNumeroLoteFabricacao());
    assertEquals(numTeclas, piano.getNumeroTeclas());
    assertEquals(numPedais, piano.getNumeroPedais());
    assertEquals(marca, piano.getMarca());
  }

  @Test
  public void testeaToStringPiano() {
    String esperado = "Piano{" +
        "numeroPedais=" + numPedais +
        ", numeroTeclas=" + numTeclas +
        ", digital=" + digital +
        ", armario=" + armario.getTipoMadeira() +
        ", efeitoSonoros=" + piano.getEfeitoSonoros().toString() +
        '}';

    assertEquals(esperado, piano.toString());
  }

}
