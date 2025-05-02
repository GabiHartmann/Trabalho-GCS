import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private int proximaMatricula = 101;

    public void cadastrarFuncionario(String nome, String email) {
        Funcionario novoFuncionario = new Funcionario(nome, email, proximaMatricula++);
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário cadastrado com sucesso: " + novoFuncionario);
    }

    public void editarFuncionario(int matricula, String novoNome, String novoEmail) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula() == matricula) {
                f.setNome(novoNome);
                f.setEmail(novoEmail);
                System.out.println("Funcionário atualizado: " + f);
                return;
            }
        }
        System.out.println("Funcionário com matrícula " + matricula + " não encontrado.");
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner sc = new Scanner(System.in);

        sistema.cadastrarFuncionario("Maria Silva", "maria@email.com");
        sistema.cadastrarFuncionario("João Souza", "joao@email.com");

        sistema.listarFuncionarios();
        
        System.out.println("Editando Maria...");
        sistema.editarFuncionario(101, "Maria Silva Pereira", "maria.pereira@email.com");

        sistema.listarFuncionarios();

        sc.close();
    }
}
