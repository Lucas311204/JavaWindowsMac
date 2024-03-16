/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

import aaaa.Button;
import aaaa.Checkbox;
import aaaa.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    // Declaração de variáveis de instância privadas
    private Button button;
    private Checkbox checkbox;

    // Construtor da classe Application que recebe uma fábrica como argumento
    public Application(GUIFactory factory) {
        // Usa a fábrica para criar um botão e uma caixa de seleção
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    // Método para desenhar os componentes na tela
    public void paint() {
        // Chama o método paint() do botão
        button.paint();
        // Chama o método paint() da caixa de seleção
        checkbox.paint();
    }
}
