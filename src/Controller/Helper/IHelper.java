/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

/**
 *
 * @author PICHAU
 */
public interface IHelper {
        //Polimorfismo entre classes helpers, podendo a classe ter várias formas
    public abstract Object obterModelo();
    
    public abstract void limparTela();
}
    