package br.com.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class app{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Integer> listaDeInteiros = new ArrayList<Integer>();
        int quantidade;
        System.out.println("Informe a quantidade de numeros que deverão ser inseridos no array: ");
        quantidade = leia.nextInt();
        int i = 0;
        while(i < quantidade){
            Random rn = new Random();
            int numero = rn.nextInt((100 - 0) + 1) + 1;   
            while(listaDeInteiros.contains(numero)){
                numero = rn.nextInt((100 - 0) + 1) + 1;
            }
            listaDeInteiros.add(numero);    
            i++;
        }
        

            System.out.println("Lista Desordenada: ");
            System.out.println(listaDeInteiros);
            System.out.println("Lista Ordenada: ");
            Collections.sort(listaDeInteiros);
            System.out.println(listaDeInteiros);
            System.out.println("Lista Reversa: ");
            Collections.reverse(listaDeInteiros);
            System.out.println(listaDeInteiros);



        leia.close();
    }
}