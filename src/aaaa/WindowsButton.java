/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

/**
 * This is a Windows variant of a button.
 */
// Classe que representa uma variante de botão para o sistema Windows
public class WindowsButton implements Button {

    @Override
    // Implementação do método paint() definido na interface Button
    public void paint() {
        // Imprime uma mensagem indicando que um botão Windows foi criado
        System.out.println("You have created WindowsButton.");
    }
}
