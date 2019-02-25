package projeto.matricula.visao;

import javax.swing.JOptionPane;
import projeto.matricula.modelo.AlunoModelo;

public class Principal {

    public static void main(String[] args) {
        AlunoModelo salvaraluno = new AlunoModelo();

        String leitura;
        leitura = JOptionPane.showInputDialog("Favor inserir o Nome do Aluno");
        salvaraluno.setNome(leitura);

        leitura = JOptionPane.showInputDialog("Favor inserir o CPF do aluno;");
        salvaraluno.setCpf(leitura);

        leitura = JOptionPane.showInputDialog("Favor inserir o Email do aluno");
        salvaraluno.setEmail(leitura);

    }
}
