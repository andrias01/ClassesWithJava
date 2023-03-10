package com.andresVelez.newspaper.domain;

public class Newspaper {
    public String title;
    public String material;
    public byte currentpage = 1;
    public byte maxpage = 7;
    public String information;
    public int year;
    public News news;
    public PrintingPress printingPress;

    public Newspaper(int year, PrintingPress printingPress) {
        this.year = year;
        this.printingPress = printingPress;
    }

    public void showInformation(){
        if (this.currentpage == 1){
            System.out.println("**Este periodico es de: "+ printingPress.name);
            System.out.println("Del año: "+ this.year);
            System.out.println("Actualmente se encuentra en la pagina: "+ this.currentpage);
        }else {
            System.out.println("No estas en la pagina de inicio...");
        }
    }
    public byte nextPage(){
        if(this.currentpage == maxpage){
            System.out.println("Ya no hay mas paginas..");
        }else {
            this.currentpage ++;
        }
        return this.currentpage;
    }
    public byte returnAPage(){
        if(this.currentpage == 1){
            System.out.println("Ya no hay mas paginas para devolver estas en el inicio..");
        }else {
            this.currentpage --;
        }
        return this.currentpage;
    }
    public String getCurrentPage() {
        return "**The current Page is " + this.currentpage ;
    }
}
