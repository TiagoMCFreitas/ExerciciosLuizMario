package br.com.ex3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int selecao;
        List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
        do{

            System.out.println("Você precisa inserir pelo menos 3 alunos: ");
            for(int i = 0; i < 3 ; i++){
             try{  
                System.out.println("Informe o nome do Aluno: ");
                String nome = leia.next();
                System.out.println("Informe o numero de matricula do aluno: ");
                int numeroMatricula = leia.nextInt();
                
                System.out.println("Informe a nota do primeiro bimestre: ");
                float nota1 = leia.nextFloat();
                while(nota1 < 0 || nota1 > 10){
                    System.out.println("Nota invalida, informe corretamente a nota do primeiro bimestre: ");
                     nota1 = leia.nextFloat();  
                }
                System.out.println("Informe a nota do segundo bimestre: ");
                float nota2 = leia.nextFloat();
                
                while(nota2 < 0 || nota2 >10){
                    System.out.println("Nota invalida, informe corretamente a nota do segundo bimestre: ");
                     nota2 = leia.nextFloat();
                }
                Aluno objetoAluno = new Aluno(numeroMatricula,nome,nota1,nota2);
                listaDeAlunos.add(objetoAluno);
                System.out.println("Aluno Adicionado");
                System.out.println(listaDeAlunos.toString());
            }catch(Exception e){
                System.out.println(e.getMessage());
             }
            }

            System.out.println("Deseja sair ou adicionar mais alunos? (0)para sair (1) para adicionar mais alunos");
            selecao = leia.nextInt();

            while(selecao != 0){
                try{  
                    System.out.println("Informe o nome do Aluno: ");
                    String nome = leia.next();
                    System.out.println("Informe o numero de matricula do aluno: ");
                    int numeroMatricula = leia.nextInt();
                    System.out.println("Informe a nota do primeiro bimestre: ");
                    float nota1 = leia.nextFloat();
                    while(nota1 < 0 || nota1 > 10){
                    System.out.println("Nota invalida, informe corretamente a nota do primeiro bimestre: ");
                     nota1 = leia.nextFloat();  
                    }
                    System.out.println("Informe a nota do segundo bimestre: ");
                    float nota2 = leia.nextFloat();
                
                    while(nota2 < 0 || nota2 >10){
                    System.out.println("Nota invalida, informe corretamente a nota do segundo bimestre: ");
                     nota2 = leia.nextFloat();
                }
    
                    Aluno objetoAluno = new Aluno(numeroMatricula,nome,nota1,nota2);
                    listaDeAlunos.add(objetoAluno);
                    System.out.println("Aluno Adicionado");
                    System.out.println(listaDeAlunos.toString());
                }catch(Exception e){
                    System.out.println(e.getMessage());
                 }
                System.out.println("Para sair pressione (0)"); 
                selecao = leia.nextInt();
            }
            selecao = 0;




        } while(selecao != 0);
        int qntdRep = 0;
        int qntdAp = 0;
        int qntdEx = 0;
        float mediaClasse = 0;
        float alunoMaiorMedia = 0;
        String nomeAlunoMaiormedia = "";
        float alunoMenorMedia = 10;
        String nomeAlunoMenormedia = "";
        
        for(Aluno a:listaDeAlunos){ 
            System.out.println("O aluno: " + a.getNome());
            System.out.println("Obteve a media: " + a.calcularMedia());
            System.out.println("O Aluno foi: " + a.verificarAprovado());
            if(a.verificarAprovado().equals("Exame")){
                qntdEx++;
            }
            else if(a.verificarAprovado().equals("Reprovado")){
                qntdRep++;
            }
            else if(a.verificarAprovado().equals("Aprovado")){
                qntdAp++;
            }
            mediaClasse+= a.calcularMedia();
            if(a.calcularMedia() > alunoMaiorMedia){
                alunoMaiorMedia = a.calcularMedia();
                nomeAlunoMaiormedia = a.getNome();
            }
            if(a.calcularMedia() < alunoMenorMedia){
                alunoMenorMedia = a.calcularMedia();
                nomeAlunoMenormedia = a.getNome();
            }
        }
        
        System.out.println("O total de Alunos: " + listaDeAlunos.size());
        System.out.println("********************************************");
        System.out.println("A quantidade de Alunos Reprovados: " + qntdRep);
        System.out.println("********************************************");
        System.out.println("A quantidade de Alunos Aprovados: " + qntdAp);
        System.out.println("********************************************");
        System.out.println("A quantidade de Alunos em Exame: " + qntdEx);
        System.out.println("********************************************");
        System.out.println("A media da classe foi: " + mediaClasse/listaDeAlunos.size());
        System.out.println("********************************************");
        System.out.println("Aluno com maior média: " +  nomeAlunoMaiormedia + " com a nota: " + alunoMaiorMedia);
        System.out.println("Aluno com menor média: " +  nomeAlunoMenormedia + " com a nota: " + alunoMenorMedia);


    }
}
