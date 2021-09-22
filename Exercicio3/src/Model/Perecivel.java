package Model;

import javax.swing.JOptionPane;

public class Perecivel extends Produto {

    Integer Validade;

    public Perecivel() {
        this.Validade = Integer.parseInt(JOptionPane.showInputDialog("Digite a validade do produto: "));
    }

    public void Mostrar() {

        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome()
                + "\n" + "Codigo: " + this.getCodigo()
                + "\n" + "Valor: " + this.getValor()
                + "\n" + "Preço Final: " + this.preço()
                + "\n" + "Validade: " + this.Validade);
    }

    public static void main(String[] args) {
        Perecivel p = new Perecivel();
        p.Mostrar();
    }

}
