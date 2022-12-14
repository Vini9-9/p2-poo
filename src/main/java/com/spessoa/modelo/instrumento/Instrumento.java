package com.spessoa.modelo.instrumento;

public abstract class Instrumento {

  /*
  Atributos: marca, numeroLoteFabricacao
  Métodos: getters, setters, emitirSom(), toString()
  */

  private String marca;
  private long numeroLoteFabricacao;

  public abstract String emitirSom();

  @Override
  public String toString() {
    return "Instrumento{" +
        "marca='" + marca + '\'' +
        ", numeroLoteFabricacao=" + numeroLoteFabricacao +
        '}';
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public long getNumeroLoteFabricacao() {
    return numeroLoteFabricacao;
  }

  public void setNumeroLoteFabricacao(long numeroLoteFabricacao) {
    this.numeroLoteFabricacao = numeroLoteFabricacao;
  }
}
