public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }


 }

