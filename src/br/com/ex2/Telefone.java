package br.com.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<String> listaDetelefones = new ArrayList<String>();
        char selecao;
        do{
            System.out.println("(a) adicionar telefones");
            System.out.println("(r) remover telefones");
            System.out.println("(l) listar telefones");
            System.out.println("(s) sair");
            selecao = leia.next().charAt(0);

            if(selecao == 'a'){
                System.out.println("informe o telefone a ser adicionado");
                String telefone = leia.next();
                listaDetelefones.add(telefone);
            }
            if(selecao == 'r'){
                System.out.println("informe a posicao do telefone a ser removido");
                int telefone = leia.nextInt();
                listaDetelefones.remove(telefone);
            }
            if(selecao == 'l'){
                System.out.println("Esta é a lista: " + "\n");
                for(int i = 0 ; i <listaDetelefones.size() ; i++){
                    System.out.println(listaDetelefones.get(i).toString() +" Na posicao "+ i);
                }
            }

        }while(selecao!= 's');




        leia.close();



    }
}
