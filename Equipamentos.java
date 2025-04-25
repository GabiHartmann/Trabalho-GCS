public class Equipamentos{
    protected int identificador;
    protected String descricao;
    protected int nmrManutencao;
    protected String dataAquizicao;
    protected double valor;
    protected Funcionario funcionario;
    protected String tipo;

    public Equipamentos(int identificador, String descricao, int nmrManutencao, String dataAquizicao, double valor, Funcionario funcionario, String tipo){
        this.identificador = identificador;
        this.descricao = descricao;
        this.nmrManutencao = nmrManutencao;
        this.dataAquizicao = dataAquizicao;
        this.valor = valor;
        this.funcionario = funcionario;
        this.tipo = tipo;
    }
}