/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaa;

import aaaa.Application;
import aaaa.GUIFactory;
import aaaa.MacOSFactory;
import aaaa.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
// Classe de demonstração onde tudo é integrado
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    // Método para configurar e criar a aplicação
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        // Obtém o nome do sistema operacional
        String osName = System.getProperty("os.name").toLowerCase();
        // Verifica se é um sistema MacOS
        if (osName.contains("mac")) {
            // Se for MacOS, cria uma fábrica MacOS
            factory = new MacOSFactory();
        } else {
            // Caso contrário, cria uma fábrica Windows
            factory = new WindowsFactory();
        }
        // Cria a aplicação usando a fábrica determinada
        app = new Application(factory);
        return app;
    }

    // Método principal, onde a aplicação é configurada e executada
    public static void main(String[] args) {
        // Configura a aplicação
        Application app = configureApplication();
        // Desenha os componentes da aplicação na tela
        app.paint();
    }
}
