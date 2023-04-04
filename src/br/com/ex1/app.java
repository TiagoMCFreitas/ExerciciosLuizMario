package br.com.ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList<Cliente>(); 
        Scanner leia = new Scanner(System.in);
        int id;
    
          do{
            System.out.println("Informe um id: " + "\n" + "(Se o id for negativo a lista será imprimida)");
            id = leia.nextInt();
            if(id <= 0){
                break;
            }
            System.out.println("Informe seu nome");
            String nome = leia.next();
            System.out.println("informe a idade: ");
            int idade = leia.nextInt();
            System.out.println("Informe o telefone: ");
            int telefone = leia.nextInt();
            Cliente objetoCliente = new Cliente(id, nome, idade, telefone);
            listaDeClientes.add(objetoCliente);

          }while (id > 0 );  

          System.out.println(listaDeClientes.toString());
    
          leia.close();
    




    }
}
