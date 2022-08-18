package com.spessoa.visao;

import com.spessoa.modelo.instrumento.corda.Guitarra;
import com.spessoa.modelo.instrumento.corda.Violao;
import com.spessoa.modelo.instrumento.piano.Armario;
import com.spessoa.modelo.instrumento.piano.EfeitoSonoro;
import com.spessoa.modelo.instrumento.piano.Piano;
import com.spessoa.modelo.musico.Musico;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  private static Musico musico = new Musico();
  private static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {

    int opcao = -1;

    while (opcao !=0) {
      System.out.println("\n");
      System.out.println("Digite uma opção:");
      System.out.println("1- Atualizar nome");
      System.out.println("2- Adicionar Guitarra");
      System.out.println("3- Adicionar Violão");
      System.out.println("4- Adicionar Piano");
      System.out.println("5- Tocar instrumentos");
      System.out.println("0- Sair");
      System.out.println("----------------");

      opcao = Integer.parseInt(entrada.nextLine());

      switch (opcao) {
        case 1: {
          try {
          System.out.println("Digite o nome:");
          String nome = entrada.nextLine();

          musico.setNome(nome);

          System.out.println("----------------");
          System.out.println("Nome atualizado com Sucesso");
          System.out.println(musico.toString());
        } catch(Exception ex){
          System.out.println("Ocorreu um erro inesperado");
          System.out.println("Tente novamente");
        }

          break;
        }
        case 2: {
          try {
          Guitarra guitarra = new Guitarra();
          System.out.println("Digite o nome da marca:");
          guitarra.setMarca(entrada.nextLine());
          System.out.println("Digite o número do lote de fabricação:");
          guitarra.setNumeroLoteFabricacao(entrada.nextLong());
          System.out.println("Digite o número de cordas:");
          guitarra.setNumeroCordas((int) entrada.nextLong());
          ArrayList arrayInstrumentos = musico.getInstrumentos();
          arrayInstrumentos.add(guitarra);
          musico.setInstrumentos(arrayInstrumentos);

          System.out.println("----------------");
          System.out.println("Guitarra adicionada com Sucesso");
          System.out.println(guitarra.toString());
        } catch(Exception ex){
          System.out.println("Ocorreu um erro inesperado");
          System.out.println("Tente novamente");
        }

          break;
        }
        case 3: {
      try {
          Violao violao = new Violao();
          System.out.println("Digite o nome da marca:");
          violao.setMarca(entrada.nextLine());
          System.out.println("Digite o número do lote de fabricação:");
          violao.setNumeroLoteFabricacao(entrada.nextLong());
          ArrayList arrayInstrumentos = musico.getInstrumentos();
          arrayInstrumentos.add(violao);
          musico.setInstrumentos(arrayInstrumentos);

          System.out.println("----------------");
          System.out.println("Violão adicionado com Sucesso");
          System.out.println(violao.toString());
        } catch(Exception ex){
          System.out.println("Ocorreu um erro inesperado");
          System.out.println("Tente novamente");
        }

          break;
        }
        case 4: {

          try {

          Piano piano = new Piano();
          System.out.println("Digite o nome da marca:");
          piano.setMarca(entrada.nextLine());
          System.out.println("Digite o número do lote de fabricação:");
          piano.setNumeroLoteFabricacao(entrada.nextLong());
          System.out.println("Digite o número de pedais:");
          piano.setNumeroPedais((int) entrada.nextLong());
          System.out.println("Digite o número de teclas:");
          piano.setNumeroTeclas((int) entrada.nextLong());

          System.out.println("Piano é digital? (True/ False)");
          piano.setDigital(entrada.nextBoolean());

          Armario armario = new Armario();
          System.out.println("Digite o tipo de Madeira do armario:");
          armario.setTipoMadeira(entrada.nextLine());
          piano.setArmario(armario);

          EfeitoSonoro es = new EfeitoSonoro();
          System.out.println("Digite o efeito sonoro do Piano:");
          es.setEfeitoSonoro(entrada.nextLine());
          piano.adicionarEfeitoSonoro(es);

          ArrayList arrayInstrumentos = musico.getInstrumentos();
          arrayInstrumentos.add(piano);
          musico.setInstrumentos(arrayInstrumentos);

          System.out.println("----------------");
          System.out.println("Piano adicionado com Sucesso");
          System.out.println(piano.toString());

          } catch(Exception ex){
            System.out.println("Ocorreu um erro inesperado");
            System.out.println("Tente novamente");
          }

          break;
        }
        case 5: {
          musico.tocarInstrumento();
          break;
        }
        case 0: {
          System.out.println("Obrigado por usar a Agenda.");
          System.exit(opcao);
        }
        default:{
          System.out.println("Opção " + opcao + " inválida.");
          break;
        }
      }
    }
  }

}
