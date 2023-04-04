package br.com.ex3;

public class Aluno {
    private int numeroMatricula;
    private String nome;
    private float notaBimestre1;
    private float notaBimestre2;

   
    public Aluno(){

    }
    public Aluno(int numeroMatricula, String nome, float notaBimestre1, float notaBimestre2)throws Exception {
        if(notaBimestre1 < 0 || notaBimestre1 > 10) throw new Exception("Nota inválida");
        if(notaBimestre2 < 0 || notaBimestre2 > 10) throw new Exception("Nota inválida");
        
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.notaBimestre1 = notaBimestre1;
        this.notaBimestre2 = notaBimestre2;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getNotaBimestre1() {
        return notaBimestre1;
    }
    public void setNotaBimestre1(float notaBimestre1) {
        this.notaBimestre1 = notaBimestre1;
    }
    public float getNotaBimestre2() {
        return notaBimestre2;
    }
    public void setNotaBimestre2(float notaBimestre2) {
        this.notaBimestre2 = notaBimestre2;
    }


   
    public float calcularMedia(){
        return (notaBimestre1 + notaBimestre2)/2;
    }
    public String verificarAprovado(){
        String saida = "";
        if(calcularMedia() <= 4) saida = "Reprovado"; 
        if(calcularMedia() > 4  && calcularMedia() < 6 ) saida = "Exame"; 
        if(calcularMedia() >= 6) saida= "Aprovado"; 
        return saida;
    }
    public String toString(){
        return numeroMatricula + ";" + nome + ";" + notaBimestre1 + ";" + notaBimestre2;

    }

}
