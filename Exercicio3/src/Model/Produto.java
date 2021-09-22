package Model;

import javax.swing.JOptionPane;

public class Produto {

    private String nome;
    private Integer codigo;
    private Double valor;
    private Double preço;

    public Produto() {
        this.nome = JOptionPane.showInputDialog("Digite o nome do produto: ", nome);
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ", codigo));
        this.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ", valor));

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
        this.preço = 1.4 * valor;
        return preço;
    }

}
