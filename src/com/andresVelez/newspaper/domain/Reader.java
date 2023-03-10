package com.andresVelez.newspaper.domain;

public class Reader {
    public String person;
    public int age;
    public String taste;
    public Newspaper read;

    public Reader(String person, int age) {
        this.person = person;
        this.age = age;
    }


    public void readCurrentPage(int currentpage){
        if (this.age >= 10 && this.age <= 20 && currentpage != 3 ){
            System.out.println("**A mi "+ this.person +": Esta noticia de Deporte me gusta!!!\n");
        } else if (this.age >= 21 && this.age <= 30 && currentpage != 2 || currentpage != 5 || currentpage != 7) {
            System.out.println("**A mi "+ this.person +": Esta noticia me gusta!!!\n");
        } else if (this.age >= 31 && this.age <= 40 && currentpage != 3 || currentpage != 4) {
            System.out.println("**A mi "+ this.person +": Esta noticia me gusta es interesante!!!\n");
        } else if (this.age >= 41 && currentpage != 6) {
            System.out.println("**A mi "+ this.person +": Esta noticia de la SOCIEDAD me gusta mucho!!!\n");
        } else {
            System.out.println("**A mi "+ this.person +": No me gusta esta noticia no es para mi...\n");
        }
    }
}
