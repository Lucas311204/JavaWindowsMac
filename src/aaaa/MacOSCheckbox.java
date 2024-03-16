/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
// Classe que representa uma variante de caixa de seleção para o sistema MacOS
public class MacOSCheckbox implements Checkbox {

    @Override
    // Implementação do método paint() definido na interface Checkbox
    public void paint() {
        // Imprime uma mensagem indicando que uma caixa de seleção MacOS foi criada
        System.out.println("You have created MacOSCheckbox.");
    }
}
