/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.usuario;
import View.Login;

/**
 *
 * @author PICHAU
 */
public class LoginHelper implements IHelper{
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        usuario modelo = new usuario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
