package br.com.ex1;

public class Cliente {
        private int id;
        private String nome;
        private int idade;
        private int telefone;

    
        public Cliente(int id, String nome, int idade, int telefone){
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.telefone = telefone;
        }
        public Cliente(){

        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public int getTelefone() {
            return telefone;
        }
        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }
        @Override
        public String toString(){
            return id + ";" + nome + ";" + idade + ";" + telefone;
        }

}
