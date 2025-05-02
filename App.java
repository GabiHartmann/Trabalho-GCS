import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Equipamentos> equipamentos = new ArrayList<>();
        ArrayList<Manutencao> manutencoes = new ArrayList<>();

        Funcionario joao = new Funcionario("João Silva", "js@gmail.com", 12345);
        Funcionario maria = new Funcionario("Maria Costa", "maria@gmail.com", 54321);
        funcionarios.add(joao);
        funcionarios.add(maria);

        Equipamentos notebook = new Equipamentos(1, "Notebook Dell", 0, "01/01/2023", 5000.0, joao, "Informática");
        equipamentos.add(notebook);

        Manutencao manut1 = new Manutencao(notebook, "10/01/2023", "Troca de HD", joao, "11/01/2023", "12/01/2023", "Concluído", "HD substituído");
        manutencoes.add(manut1);

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
