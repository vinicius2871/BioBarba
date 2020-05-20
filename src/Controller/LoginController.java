/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.usuario;
import View.Login;

/**
 *
 * @author PICHAU
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entraNoSistema(){
       
        usuario Usuario = helper.obterModelo();
        //Pegar um Usuario da view
        //Pesquisar o Usuario no Banco
        //Se o usuario da view tiver o mesmo usuario vindo do banco, direcionar para o menu principal
        //Senão mostar uma mensagem ao usuario "Usuario ou senha invalidos"
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
        
        
    }
    
}
