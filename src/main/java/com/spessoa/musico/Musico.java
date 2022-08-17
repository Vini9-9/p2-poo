package com.spessoa.musico;

import com.spessoa.instrumento.Instrumento;
import java.util.ArrayList;

public class Musico {

  private String nome;
  private ArrayList<Instrumento> intrumentos;

  public void tocarInstrumento(Instrumento instrumento){
    System.out.println("Tocando " + instrumento.toString());
  }

  @Override
  public String toString() {
    return "Musico{" +
        "nome='" + nome + '\'' +
        ", intrumentos=" + intrumentos +
        '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Instrumento> getIntrumentos() {
    return intrumentos;
  }

  public void setIntrumentos(ArrayList<Instrumento> intrumentos) {
    this.intrumentos = intrumentos;
  }
}
