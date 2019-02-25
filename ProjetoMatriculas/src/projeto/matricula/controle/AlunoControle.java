package projeto.matricula.controle;

import javax.swing.JOptionPane;
import projeto.matricula.modelo.AlunoModelo;

public class AlunoControle {

    public String salvarAluno(AlunoModelo a) {
        if (a.getNome().length() < 3) {
            return "Cadastro não realizado - nome inválido";

        } else if (a.getCpf().length() != 11) {
            return "Cadastro não realizado - CPF inválido";

        } else if (a.getEmail().contains("@") || a.getEmail().contains(".com")) {
            return "Cadastro não realizado - email inválido";

        } else {
            return "Cadastro realizado com Sucesso";
        }
    }
}
