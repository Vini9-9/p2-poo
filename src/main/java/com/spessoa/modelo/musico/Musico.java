package com.spessoa.modelo.musico;

import com.spessoa.modelo.instrumento.Instrumento;
import com.spessoa.modelo.instrumento.corda.Distorcao;
import java.util.ArrayList;

public class Musico {

  private String nome;
  private ArrayList<Instrumento> instrumentos;

  /*
  No métodos tocarInstrumento(), da classe Musico,
  deve-se percorre a lista de instrumentos do músico e chama o método emitirSom(),
  verificando também se o instrumento tem Distorção para chamar o métodos emitirSomDistorcao()
  */
  public void tocarInstrumento(){
    for (Instrumento instrumento: instrumentos
    ) {
      System.out.println(instrumento.emitirSom());
      if(instrumento instanceof Distorcao){
        System.out.println(((Distorcao) instrumento).emitirSomDistorcido());
      }
    }
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
