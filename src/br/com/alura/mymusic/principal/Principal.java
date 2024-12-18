package br.com.alura.mymusic.principal;

import br.com.alura.mymusic.modelos.MinhasPreferidas;
import br.com.alura.mymusic.modelos.Musica;
import br.com.alura.mymusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setCantor("Kiss");

        for(int i = 0; i < 1000; i ++){
            musica.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000 ; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000 ; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);

    }
}