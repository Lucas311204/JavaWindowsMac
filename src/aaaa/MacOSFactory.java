/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

import aaaa.Button;
import aaaa.MacOSButton;
import aaaa.Checkbox;
import aaaa.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
// Classe responsável por criar produtos específicos para o sistema operacional MacOS
public class MacOSFactory implements GUIFactory {

    @Override
    // Implementação do método para criar um botão
    public Button createButton() {
        // Retorna uma instância de MacOSButton
        return new MacOSButton();
    }

    @Override
    // Implementação do método para criar uma caixa de seleção
    public Checkbox createCheckbox() {
        // Retorna uma instância de MacOSCheckbox
        return new MacOSCheckbox();
    }
}
