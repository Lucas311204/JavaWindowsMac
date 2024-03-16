/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

import aaaa.Button;
import aaaa.WindowsButton;
import aaaa.Checkbox;
import aaaa.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and is responsible for creating
 * products of a single variety.
 */
// Classe responsável por criar produtos específicos para o sistema operacional Windows
public class WindowsFactory implements GUIFactory {

    @Override
    // Implementação do método para criar um botão
    public Button createButton() {
        // Retorna uma instância de WindowsButton
        return new WindowsButton();
    }

    @Override
    // Implementação do método para criar uma caixa de seleção
    public Checkbox createCheckbox() {
        // Retorna uma instância de WindowsCheckbox
        return new WindowsCheckbox();
    }
}
