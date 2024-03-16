/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
// Classe que representa uma variante de botão para o sistema MacOS
public class MacOSButton implements Button {

    @Override
    // Implementação do método paint() definido na interface Button
    public void paint() {
        // Imprime uma mensagem indicando que um botão MacOS foi criado
        System.out.println("You have created MacOSButton.");
    }
}
