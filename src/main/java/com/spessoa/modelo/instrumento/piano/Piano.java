package com.spessoa.modelo.instrumento.piano;

import com.spessoa.modelo.instrumento.Instrumento;
import java.util.ArrayList;

public class Piano extends Instrumento {

  /*
  Classe: instrumento.piano.Piano

  Atributos: numeroPedais, numeroTeclas,
  Boolean digital,  Armario armario; ArrayList<EfeitoSonoro> efeitosSonoros

  Métodos: getters, setters, toString, adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro), emitirSom()
  */

  private int numeroPedais;
  private int numeroTeclas;
  private Boolean digital;
  private Armario armario;
  private ArrayList<EfeitoSonoro> efeitoSonoros = new ArrayList<>();

  public void adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro){
    this.efeitoSonoros.add(efeitoSonoro);
  }

  @Override
  public String toString() {
    return "Piano{" +
        "numeroPedais=" + numeroPedais +
        ", numeroTeclas=" + numeroTeclas +
        ", digital=" + digital +
        ", armario=" + armario.getTipoMadeira() +
        ", efeitoSonoros=" + efeitoSonoros.toString() +
        '}';
  }

  @Override
  public String emitirSom() {
    return "Som de Piano";
  }

  public int getNumeroPedais() {
    return numeroPedais;
  }

  public void setNumeroPedais(int numeroPedais) {
    this.numeroPedais = numeroPedais;
  }

  public int getNumeroTeclas() {
    return numeroTeclas;
  }

  public void setNumeroTeclas(int numeroTeclas) {
    this.numeroTeclas = numeroTeclas;
  }

  public Boolean getDigital() {
    return digital;
  }

  public void setDigital(Boolean digital) {
    this.digital = digital;
  }

  public Armario getArmario() {
    return armario;
  }

  public void setArmario(Armario armario) {
    this.armario = armario;
  }

  public ArrayList<EfeitoSonoro> getEfeitoSonoros() {
    return efeitoSonoros;
  }

  public void setEfeitoSonoros(ArrayList<EfeitoSonoro> efeitoSonoros) {
    this.efeitoSonoros = efeitoSonoros;
  }
}
