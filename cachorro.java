/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testetrabalho;

/**
 *
 * @author Bruno Stefanello
 */
public class cachorro {

    String nome;
    int peso;
    String corOlhos;
    int quantPatas;
    String corPelos;
    String raca;
    int tamanho;

    public void latir() {
        if (tamanho > 60) {
            System.out.println("wooof, wooof!");
        } else if (tamanho > 14) {
            System.out.println("Ruff, Ruff!");
        } else {
            System.out.println("Yip!, Yip!");
        }
    }
}
