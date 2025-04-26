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

    public String getDataAquizicao() {
        return dataAquizicao;
    }

    public void setDataAquizicao(String dataAquizicao) {
        this.dataAquizicao = dataAquizicao;
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
        return "Equipamentos{" +
                "identificador=" + identificador +
                ", descricao='" + descricao + '\'' +
                ", nmrManutencao=" + nmrManutencao +
                ", dataAquizicao='" + dataAquizicao + '\'' +
                ", valor=" + valor +
                ", funcionario=" + funcionario +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}