package com.spessoa.instrumento.corda;

import com.spessoa.instrumento.Instrumento;

public class Violao extends Instrumento implements Distorcao {

  /*Classe: instrumento.corda.Violao

  Atributos: numeroCordas

  Metodos:  emitirSom(), emitirSomDistorcido(), getNumCordas(), toString()*/

  private int numeroCordas;

  @Override
  public String emitirSom() {
    return "Som de Violão";
  }

  @Override
  public String emitirSomDistorcido() {
    return "Som distorcido de Violão";
  }

  public int getNumCordas() {
    return numeroCordas;
  }

  @Override
  public String toString() {
    return "Violao{" +
        "numeroCordas=" + numeroCordas +
        '}';
  }
}
