package Exercicio1;


import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        Cliente c = new Cliente();
        
        
        c.setNome(JOptionPane.showInputDialog("Digite seu nome: ")); 
        c.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo: "))) ;
        c.setCPF(JOptionPane.showInputDialog("Digite seu CPF: "));
        
        JOptionPane .showMessageDialog(null,"Nome: " + 
                c.getNome()+"\n"+"Codigo: " +
                c.getCodigo()+"\n"+"CPF: " +
                c.getCPF());
    }
    
}
