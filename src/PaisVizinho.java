import java.util.HashSet;
import java.util.Set;

public class PaisVizinho {

    public PaisVizinho() {

    }
    private Set<String> vizinho = new HashSet<>();
    public void VizinhoBrasil(){
        this.vizinho.add("Uruguai");
        this.vizinho.add("Paraguai");
        this.vizinho.add("Argentina");
        this.vizinho.add("Colombia");

    }

    public void mostraPaisVizinho(){
        for(String p : vizinho){
            System.out.println("Países Vizinhos: " +p);
        }
    }

    public void verificaVizinho(String novoPais){
        if(vizinho.contains(novoPais)){
        System.out.println("Ele é vizinho");
        }else {
            System.out.println("Ele não é vizinho");
        }
    }

}
 