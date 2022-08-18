package com.spessoa.musico;

import com.spessoa.instrumento.Instrumento;
import java.util.ArrayList;

public class Musico {

  private String nome;
  private ArrayList<Instrumento> instrumentos;

  /*
  No métodos tocarInstrumento(), da classe Musico, deve-se percorre a lista de instrumentos do músico e chama o método emitirSom(),
  verificando também se o instrumento tem Distorção para chamar o métodos emitirSomDistorcao()
  */
  public void tocarInstrumento(){
    System.out.println("Tocando " + instrumentos.toString());
  }

  @Override
  public String toString() {
    return "Musico{" +
        "nome='" + nome + '\'' +
        ", instrumentos=" + instrumentos +
        '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Instrumento> getInstrumentos() {
    return instrumentos;
  }

  public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
    this.instrumentos = instrumentos;
  }
}
