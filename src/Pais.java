public abstract class Pais extends PaisVizinho {

    private int codIso;
    private String nomePais;
    private int populacao;
    private double dimensao;

    public Pais(int codIso, String nomePais, int populacao, double dimensao) {
        this.codIso = codIso;
        this.nomePais = nomePais;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }


    public int getCodIso() {
        return codIso;
    }

    public void setCodIso(int codIso) {
        this.codIso = codIso;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}
