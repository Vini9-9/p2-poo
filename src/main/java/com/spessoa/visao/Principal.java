package com.spessoa.visao;

import com.spessoa.modelo.musico.Musico;
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
      System.out.println("2- Adicionar Instrumento");
      System.out.println("3- Remover contato");
      System.out.println("4- Listar todos os instrumentos");
      System.out.println("5- Tocar instrumentos");
      System.out.println("0- Sair");
      System.out.println("----------------");

      opcao = Integer.parseInt(entrada.nextLine());

      switch (opcao) {
        case 1: {
          System.out.println("Digite o nome:");
          String nome = entrada.nextLine();

          musico.setNome(nome);

          System.out.println("----------------");
          System.out.println("Nome atualizado com Sucesso");
          System.out.println(musico.toString());

          break;
        }
        /*case 2: {
          System.out.println("Digite o email:");
          Pessoa contatoEncontrado = controleAgenda.buscarContato(entrada.nextLine());
          if(contatoEncontrado != null){
            System.out.println("----------------");
            System.out.println("Contato Encontrado com Sucesso");
            System.out.println(contatoEncontrado.toString());
          } else {
            System.out.println("----------------");
            System.out.println("Contato não encontrado");
          }
          break;
        }
        case 3: {
          System.out.println("Digite o email:");
          Pessoa contatoEncontrado = controleAgenda.buscarContato(entrada.nextLine());
          if(contatoEncontrado != null){
            System.out.println("Digite o nome:");
            String nome = entrada.nextLine();

            System.out.println("Digite o telefone:");
            String telefone = entrada.nextLine();

            System.out.println("Digite o email:");
            String email = entrada.nextLine();

            System.out.println("Ano de nascimento:");
            Integer anoNascimento = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite o tipo sanguineo:");
            String tipoSanguineo = entrada.nextLine();

            controleAgenda.atualizarContato(contatoEncontrado, nome, telefone, email, anoNascimento, tipoSanguineo);
            System.out.println("----------------");
            System.out.println("Contato atualizado:");
            System.out.println(contatoEncontrado.toString());
          }
          break;
        }
        case 4: {
          System.out.println("Digite o email:");
          Pessoa contatoEncontrado = controleAgenda.buscarContato(entrada.nextLine());
          if(contatoEncontrado != null){
            controleAgenda.removerContato(contatoEncontrado);
            System.out.println("Contato com id " + contatoEncontrado.getId() + " removida.");
          } else{
            System.out.println("----------------");
            System.out.println("Contato não encontrado");
          }
          break;
        }
        case 5: {
          imprimirContatos(controleAgenda.getContatos());
          break;
        }*/
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
