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

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Cadastrar Equipamento");
            System.out.println("3. Cadastrar Manutencao");
            System.out.println("4. Listar Funcionarios");
            System.out.println("5. Listar Equipamentos");
            System.out.println("6. Listar Manutencao");
            System.out.println("7. Sair");
            opcao = teclado.nextInt();
            teclado.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    Funcionario novoFuncionario = new Funcionario("", "", 0);
                    novoFuncionario.preencher();
                    funcionarios.add(novoFuncionario);
                    break;
                case 2:
                    Equipamentos novoEquipamento = new Equipamentos(0, "", 0, "", 0.0, new Funcionario("", "", 0), "");
                    novoEquipamento.preencher();
                    equipamentos.add(novoEquipamento);
                    break;
                case 3:
                    Manutencao novaManutencao = new Manutencao(null, "", "", null, "", "", "", "");
                    novaManutencao.preencher();
                    manutencoes.add(novaManutencao);
                    break;
                case 4:
                    for (Funcionario f : funcionarios) {
                        System.out.println(f);
                    }
                    break;
                case 5:
                    for (Equipamentos e : equipamentos) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    for (Manutencao m : manutencoes) {
                        System.out.println(m);
                    }
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
