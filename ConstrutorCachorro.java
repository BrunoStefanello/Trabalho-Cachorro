/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cachorroprofessor;

/**
 *
 * @author Bruno Stefanello
 */
class ConstrutorCachorro {
    private final String nomeCachorro;
    
    public ConstrutorCachorro(String nome)
    {
        nomeCachorro = nome;
    }
    public String getNome()
    {
        return "Nome do Cachorro: " + nomeCachorro;
    }
    
}
