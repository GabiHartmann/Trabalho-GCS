public class Manutencao {
    protected Equipamentos equipamento;   
    protected String datapedido;
    protected String descricao;
    protected Funcionario funcionario;
    protected String dataEntrada;
    protected String dataSaida;
    protected String status;
    protected String solucao;

    public Manutencao(Equipamentos equipamento, String datapedido, String descricao, Funcionario funcionario, String dataEntrada, String dataSaida, String status, String solucao) {
        this.equipamento = equipamento;
        this.datapedido = datapedido;
        this.descricao = descricao;
        this.funcionario = funcionario;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
        this.solucao = solucao;
    }

    public Equipamentos getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamentos equipamento) {
        this.equipamento = equipamento;
    }

    public String getDatapedido() {
        return datapedido;
    }  

    public void setDatapedido(String datapedido) {
        this.datapedido = datapedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSolucao() {
        return solucao;
    }
    
    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

}
