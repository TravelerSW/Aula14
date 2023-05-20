package aula14;

public class Aula14 {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de poo");
        v[1] = new Video ("Aula 2 de poo");
        v[2] = new Video("aula 3 de poo");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Kevin", 21, "Masculino", "Kamf");
        g[1] = new Gafanhoto("Jonas", 22, "Masculino", "Soap");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[1] = new Visualizacao(g[1], v[2]);
        
        v[2].like(); //o método like está definido na classe Video, então é utilizado a chamada v[2].like, que seria like no vídeo 2.
        v[2].like();
        v[2].play();
        
        

        System.out.println(vis[1].toString());
        
    }
    
}
