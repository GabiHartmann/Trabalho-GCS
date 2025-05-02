import java.util.Scanner;

public class Equipamentos{
    protected int identificador;
    protected String descricao;
    protected int nmrManutencao;
    protected String dataAquisicao;
    protected double valor;
    protected Funcionario funcionario;
    protected String tipo;

    public Equipamentos(int identificador, String descricao, int nmrManutencao, String dataAquisicao, double valor, Funcionario funcionario, String tipo){
        this.identificador = identificador;
        this.descricao = descricao;
        this.nmrManutencao = nmrManutencao;
        this.dataAquisicao = dataAquisicao;
        this.valor = valor;
        this.funcionario = funcionario;
        this.tipo = tipo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }  

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNmrManutencao() {
        return nmrManutencao;
    }

    public void setNmrManutencao(int nmrManutencao) {
        this.nmrManutencao = nmrManutencao;
    }

    public String getdataAquisicao() {
        return dataAquisicao;
    }

    public void setdataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Equipamentos {" +
                "identificador= " + identificador +
                ", descricao= '" + descricao + '\'' +
                ", nmrManutencao=" + nmrManutencao +
                ", dataAquisicao= '" + dataAquisicao + '\'' +
                ", valor= " + valor +
                ", funcionario= " + funcionario +
                ", tipo= '" + tipo + '\'' +
                '}';
    }

    public void preencher(){
        Scanner teclado = new Scanner (System.in);
        teclado.nextLine();
        System.out.println("----Preenchendo os dados do equipamento----");

        System.out.println("Informe o identificador");
        this.identificador= teclado.nextInt();
        teclado.nextLine();

        System.out.println("Informe a descricao");
        this.descricao= teclado.nextLine();

        System.out.println("Informe o numero de manutencao");
        this.nmrManutencao= teclado.nextInt();
        teclado.nextLine();

        System.out.println("Informe a data de aquisicao");
        this.dataAquisicao= teclado.nextLine();

        System.out.println("Informe o valor do equipamento");
        this.valor= teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Informe o tipo do equipamento");
        this.tipo= teclado.nextLine();

        System.out.println("Informe o funcionario responsavel pelo equipamento");
        this.funcionario.preencher();

        System.out.println("----Dados preenchidos com sucesso----");

    }
}