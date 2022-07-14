import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PaisVizinho p1 = new PaisVizinho();

        Brasil b1 = new Brasil(3166-1,"Brasil",1939463886,8515767.049);

      //  p1.VizinhoBrasil();


        System.out.println("Digite um pais para saber se é vizinho");
        Scanner entrada = new Scanner(System.in);
        String pais = entrada.next();

        p1.verificaVizinho(pais);

        b1.densidadePopulacional();
       // p1.mostraPaisVizinho();






    }
}
