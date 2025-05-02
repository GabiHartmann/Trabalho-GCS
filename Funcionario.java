import java.util.Scanner;
public class Funcionario{
    protected String nome;
    protected String email;
    protected int matricula;

    public Funcionario(String nome, String email, int matricula){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public void preencher(){
        Scanner teclado = new Scanner (System.in);
        teclado.nextLine();
        System.out.println("----Preenchendo os dados do funcionario----");

        System.out.println("Informe o nome");
        this.nome= teclado.nextLine();
        System.out.println("Informe o email");
        this.email= teclado.nextLine();
        System.out.println("Informe a matricula");
        this.matricula= teclado.nextInt();

        teclado.close();
        System.out.println("----Dados preenchidos com sucesso----");
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}