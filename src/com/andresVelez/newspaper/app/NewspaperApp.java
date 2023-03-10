package com.andresVelez.newspaper.app;

import com.andresVelez.newspaper.domain.News;
import com.andresVelez.newspaper.domain.Newspaper;
import com.andresVelez.newspaper.domain.PrintingPress;
import com.andresVelez.newspaper.domain.Reader;

public class NewspaperApp {
    public static void main(String[] args) {
        /*
            10-20 deporte
            21-30 politica cultura ciencia
            31-40 deporte economia
            40 mas ciencia

            2-politica
            3-deporte
            4-economia
            5-cultura
            6-social
            7-ciencia
        */
        Reader andresVelez = new Reader("Andres Velez", 50);
        Reader alejandro = new Reader("Alejandro", 12);
        Reader andresCardona = new Reader("Andres Cardona", 26);
        Reader andresOchoa = new Reader("Andres Ochoa", 35);
        PrintingPress periodicoElRionegrero = new PrintingPress("Periodico El Rionegrero");
        PrintingPress periodicoElMundo = new PrintingPress("Periodico El Mundo");
        PrintingPress periodicoLaComuna = new PrintingPress("Periodico La Comuna");
        PrintingPress periodicoSomosRegion = new PrintingPress("Periodico Somos Region");
        News news = new News();


        Newspaper newspaper = new Newspaper(2023,periodicoElMundo);
        newspaper.showInformation();

        newspaper.nextPage();
        System.out.println(newspaper.getCurrentPage());
        news.findTypeOfNews(newspaper.currentpage);
        andresVelez.readCurrentPage(newspaper.currentpage);

        newspaper.nextPage();//Esto pasa las paginas
        System.out.println(newspaper.getCurrentPage());//Esto muestra la pagina actual
        news.findTypeOfNews(newspaper.currentpage);//Esto lee la noticia de esa pagina
        andresVelez.readCurrentPage(newspaper.currentpage);//Esto pone a leer a una persona esa pagina

        newspaper.nextPage();
        newspaper.nextPage();
        newspaper.nextPage();
        newspaper.nextPage();
        System.out.println(newspaper.getCurrentPage());
        news.findTypeOfNews(newspaper.currentpage);
        andresVelez.readCurrentPage(newspaper.currentpage);

        newspaper.returnAPage();
        System.out.println(newspaper.getCurrentPage());
        news.findTypeOfNews(newspaper.currentpage);
        alejandro.readCurrentPage(newspaper.currentpage);

    }
}
