package Exercicio2;

import javax.swing.JOptionPane;
import Model.Produto;

public class Exercicio2 {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
        p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")));
        p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));

        JOptionPane.showMessageDialog(null, "Nome: " + p.getNome() + "\n"
                + "Codigo: " + p.getCodigo() + "\n"
                + "Valor: " + p.getValor() + "\n"
                + "Preço Final: " + p.preço());
    }
}
