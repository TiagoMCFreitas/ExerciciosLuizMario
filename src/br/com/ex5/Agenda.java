package br.com.ex5;

import java.util.ArrayList;

public class Agenda {
    public ArrayList <Contato> listaDeContatos= new ArrayList<Contato>();
    
    public void incluirContato(Contato contato){
        listaDeContatos.add(contato);
    }
    public void removerContato(String NomeContato){
        
        for(int i = 0; i < listaDeContatos.size();i++){
        
        if(listaDeContatos.get(i).getNome().equals(NomeContato)){
            listaDeContatos.remove(i);
        }
    }
        
    }

    public void listarContatos(){
        for(int i = 0; i < listaDeContatos.size();i++){
            System.out.println( listaDeContatos.get(i).toString());
        }
        
    }
    public void buscarContato(String nome){
        for(int i = 0; i < listaDeContatos.size(); i++){
            if(listaDeContatos.get(i).getNome().contains(nome)){
                System.out.println("Nome: " + listaDeContatos.get(i).getNome());
                System.out.println("Telefone: " + listaDeContatos.get(i).getTelefone());
            }
        }
    
    }


}
