public class Manutencao {
    protected Equipamentos equipamento;   
    protected String datapedido;
    protected String descricao;
    protected Funcionario funcionario;
    protected String dataEntrada;
    protected String dataSaida;
    protected String status;

    public Manutencao(Equipamentos equipamento, String datapedido, String descricao, Funcionario funcionario, String dataEntrada, String dataSaida, String status) {
        this.equipamento = equipamento;
        this.datapedido = datapedido;
        this.descricao = descricao;
        this.funcionario = funcionario;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
    }

}
