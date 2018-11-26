/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author victor
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int novaEdicao = 2;
        Panini revistaHomemAranha = new Panini();
        Assinante assinante1 = new Assinante(revistaHomemAranha);
        
        revistaHomemAranha.setNovaEdicao(novaEdicao);
        }
    
}
