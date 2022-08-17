package com.spessoa.musico;

import java.util.ArrayList;

public class Musico {

  private String nome;
  private ArrayList intrumentos;

  public void tocarInstrumento(){

  }

  @Override
  public String toString() {
    return super.toString();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList getIntrumentos() {
    return intrumentos;
  }

  public void setIntrumentos(ArrayList intrumentos) {
    this.intrumentos = intrumentos;
  }
}
