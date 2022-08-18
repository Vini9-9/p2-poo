package com.spessoa.modelo.instrumento.corda;

import com.spessoa.modelo.instrumento.Instrumento;

public class Guitarra extends Instrumento implements Distorcao{

  /*Classe: instrumento.corda.Guitarra

  Atributos: numeroCordas

  Metodos:  emitirSom(), emitirSomDistorcido(), getNumCordas(), toString()*/

  private int numeroCordas;

  public String emitirSom(){
    return "Som de guitarra";
  }

  public String emitirSomDistorcido(){
    return "Som distorcido de guitarra";
  }

  public int getNumCordas() {
    return numeroCordas;
  }

  @Override
  public String toString() {
    return "Guitarra{" +
        "numeroCordas=" + numeroCordas +
        '}';
  }
}
