/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

// Interface que define uma fábrica abstrata para criar botões e caixas de seleção
public interface GUIFactory {
    // Método para criar um botão
    Button createButton();
    // Método para criar uma caixa de seleção
    Checkbox createCheckbox();
}
