package aaaa;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 */
// Interface que define o comportamento comum para todos os botões
public interface Button {
    // Método para pintar/desenhar o botão
    void paint();
}
