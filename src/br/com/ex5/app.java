package br.com.ex5;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
        Agenda objetoAgenda = new Agenda();
        int selecao;

        do{
            
            System.out.println("|1| Incluir Contato");
            System.out.println("|2| Excluir Contato");
            System.out.println("|3| Listar Contatos");
            System.out.println("|4| Pesquisar Contato");
            System.out.println("|5| Sair da Aplicacao");
            selecao = leia.nextInt();
            leia.nextLine();
            while(selecao == 1){

            System.out.println("Informe o nome: ");
            String nome = leia.nextLine();
            System.out.println("Informe o Telefone: ");
            String telefone = leia.next();
            System.out.println("Informe o Email: ");
            String email = leia.next();
            Contato objetoContato = new Contato(nome,email,telefone);
            
            objetoAgenda.incluirContato(objetoContato);
            System.out.println("para realizar outra operacao digite 0 para continuar digite 1");
            selecao = leia.nextInt();
            }
            while(selecao == 2){
             
                System.out.println("Exclusao de Contato");
                
                objetoAgenda.listarContatos();
                System.out.println("informe o nome do contato que deseja excluir: ");
                String nome = leia.next();
                objetoAgenda.removerContato(nome);
                System.out.println("para realizar outra operacao digite 0 para continuar digite 2");
                selecao = leia.nextInt();
            }
            if(selecao == 3){
                System.out.println("Listagem de Contatos: ");
                objetoAgenda.listarContatos();
            }
            while(selecao == 4){
                System.out.println("informe o nome ou  alguma parte do nome do contato a ser pesquisado");
                String nome = leia.next();
                objetoAgenda.buscarContato(nome);
                System.out.println("para realizar outra operacao digite 0 para continuar digite 4");
                selecao = leia.nextInt();
            }
            
        }while(selecao != 5);
        leia.close();
    }
    
}
