import java.util.HashSet;
import java.util.Set;

public class Brasil extends Pais{

    public Brasil(int codIso, String nomePais, int populacao, double dimensao) {
        super(codIso, nomePais, populacao, dimensao);
    }

    public void densidadePopulacional(){
        System.out.println("A densidade populacional é: " + (getPopulacao() / getDimensao()));
    }



}
