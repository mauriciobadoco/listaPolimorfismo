import java.util.HashSet;
import java.util.Set;

public class PaisVizinho {

    public PaisVizinho() {

    }
    private Set<PaisVizinho> vizinho = new HashSet<>();
    public void VizinhoBrasil(PaisVizinho p1){
        this.vizinho.add(p1);
        p1.vizinho.add(this);
    }

    public void mostraPaisVizinho(){
        for(PaisVizinho p : vizinho){
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
  //  public void adicionarVizinho(Pais p1) {
    //    this.vizinhos.add(p1);
      //  p1.vizinhos.add(this);