package Exercicio1;

public class Cliente {
    
    private String nome;
    private Integer codigo;
    private String CPF; 

    Cliente() {   
    }

    public Cliente(String nome, Integer codigo, String CPF) {
        this.nome = nome;
        this.codigo = codigo;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
}
