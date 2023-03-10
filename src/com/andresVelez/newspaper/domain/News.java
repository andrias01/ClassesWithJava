package com.andresVelez.newspaper.domain;

public class News {
    public int type;



    public void findTypeOfNews(int numero){
        switch (numero){
            case 2:
                System.out.println("**NOTICIA DE POLITICA ");
                System.out.println("PETRO SOBRE TASAS DE INTERÉS DE BANCOLOMBIA: ");
                System.out.println("'los otros bancos deberían seguir el ejemplo de bancolombia' \n");
                break;
            case 3:
                System.out.println("**NOTICIA DE DEPORTE ");
                System.out.println("Mariana Pajón también ataca a Mindeporte por recursos para ciclo olímpico: ");
                System.out.println("Pajón, en entrevista con Caracol Radio, reveló que ella ha tenido que poner dinero para lelvar a cabo su preparación para París 2024. \n");
                break;
            case 4:
                System.out.println("**NOTICIA DE ECONOMIA ");
                System.out.println("Deuda externa de Colombia aumentó: ¿a quiénes les debe el país?: ");
                System.out.println("1. Banca comercial: US$1.324 millones");
                System.out.println("2. Organismos internacionales: US$1.146 millones");
                System.out.println("3. Banca bilateral y otros acreedores (US$36 millones).");
                break;
            case 5:
                System.out.println("**NOTICIA DE CULTURA ");
                System.out.println("Colombia brilla en las nominaciones a los Premios Platino");
                System.out.println("Película colombiana Los reyes del mundo, de Laura Mora. \n");
                break;
            case 6:
                System.out.println("**NOTICIA SOCIAL ");
                System.out.println("Terminó la tercera edición de la Copa Navidad Herbalife Nutrition: ");
                System.out.println("Este torneo de fútbol se disputó en Bogotá, Cali y Cartagena desde el 12 de noviembre hasta el 23 de diciembre.. \n");
                break;
            case 7:
                System.out.println("**NOTICIA CIENTIFICA ");
                System.out.println("¿Por qué la gripa nos hace sentir cansados y con ganas de ir a la cama?: ");
                System.out.println("Un estudio encontró que la respuesta del cuerpo ante las infecciones, que es una orden del cerebro, ");
                System.out.println("viaja a través de un mecanismo ignorado hasta ahora por los investigadores.. \n");
                break;
        }
    }
}
