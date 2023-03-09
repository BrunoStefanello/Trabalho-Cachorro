/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testetrabalho;

/**
 *
 * @author Bruno Stefanello
 */
public class TesteTrabalho {

    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro();
        cachorro1.nome = "Tobi";
        cachorro1.corOlhos = "Azuis";
        cachorro1.peso = 53;
        cachorro1.quantPatas = 4;
        cachorro1.corPelos = "Caramelo";
        cachorro1.raca = "Vira-Latas";
        cachorro1.tamanho = 70;
 
        cachorro cachorro2 = new cachorro();
        cachorro2.nome = "Bilu";
        cachorro2.corOlhos = "Verdes";
        cachorro2.peso = 40;
        cachorro2.quantPatas = 3;
        cachorro2.corPelos = "Branco";
        cachorro2.raca = "PitBull";
        cachorro2.tamanho = 60;

        cachorro cachorro3 = new cachorro();
        cachorro3.nome = "Toto";
        cachorro3.corOlhos = "Castanho";
        cachorro3.peso = 30;
        cachorro3.quantPatas = 4;
        cachorro3.corPelos = "Amarelo";
        cachorro3.raca = "Labrador";
        cachorro3.tamanho = 50;

        cachorro cachorro4 = new cachorro();
        cachorro4.nome = "Preta";
        cachorro4.corOlhos = "Castanho";
        cachorro4.peso = 8;
        cachorro4.quantPatas = 4;
        cachorro4.corPelos = "Preto";
        cachorro4.raca = "Poodle";
        cachorro4.tamanho = 10;

        cachorro cachorro5 = new cachorro();
        cachorro5.nome = "Bob";
        cachorro5.corOlhos = "Amarelo";
        cachorro5.peso = 20;
        cachorro5.quantPatas = 4;
        cachorro5.corPelos = "Marrom";
        cachorro5.raca = "Vira-Lata";
        cachorro5.tamanho = 20;
        
        cachorro1.latir();
        cachorro2.latir();
        cachorro3.latir();
        cachorro4.latir();
        cachorro5.latir();
    }
}
