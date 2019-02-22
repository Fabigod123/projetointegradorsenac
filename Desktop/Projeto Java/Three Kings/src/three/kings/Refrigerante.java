public class Refrigerante {
    //1. Encapsulamento dos atributos (private)
    private String marca, tamanho;
    private double preco ;
    
    //2. Metodo construtor
    public Refrigerante() {
    }
    
    public Refrigerante (String cpf, String nome, double 7.50) {
        this.marca = ;
        this.tamanho = ;
        this.preco = 7.50;
    }
    
    //3. Getters e Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getMatricula() {
        return matricula;
    }
    
    public void imprimeContato(){
        System.out.println("Matricula: " + this.matricula + "\nNome: " +
                this.nome + "\nTelefone: " + this.telefone +
                "\nE-mail: " + this.email );
    }
    
}