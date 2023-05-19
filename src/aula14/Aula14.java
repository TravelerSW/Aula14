package aula14;

public class Aula14 {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de poo");
        v[1] = new Video ("Aula 2 de poo");
        v[2] = new Video("aula 3 de poo");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("KEvin", 21, "m", "keke");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
    }
    
}
