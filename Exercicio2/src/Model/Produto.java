package Model;

public class Produto {

    private String nome;
    private Integer codigo;
    private Double valor;
    private Double preço;

    public Produto() {
    }

    public Produto(String nome, Integer codigo, Double valor, Double preço) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.preço = preço;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double preço() {
        this.preço = 1.2 * valor;
        return preço;
    }
}
