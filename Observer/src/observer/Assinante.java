/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author victor
 */
class Assinante implements Observer {
    Observable revistaHomemAranha;
     
    int edicaoAmigaoDaVizinhanca;
     
    public Assinante(Observable revistaHomemAranha) {
        this.revistaHomemAranha = revistaHomemAranha;
        revistaHomemAranha.addObserver((java.util.Observer) this);
    }
     
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof Panini) {
            Panini revistaInformatica = (Panini) revistaInfSubject;
            edicaoAmigaoDaVizinhanca = revistaInformatica.getEdicao();
            System.out.println("Atenção, já chegou a mais uma edição da Revista Homem-Aranha. " +
                    "Esta é a sua edição número: " + edicaoAmigaoDaVizinhanca);
        }
    }   
     
}
