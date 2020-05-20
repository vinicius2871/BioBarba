/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.usuario;
import View.Login;
import View.MenuPrincipal;

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
       //Pegar um Usuario da view
        usuario Usuario = helper.obterModelo();
        //Pesquisar o Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(Usuario);
        //Se o usuario da view tiver o mesmo usuario vindo do banco, direcionar para o menu principal
        //Senão mostar uma mensagem ao usuario "Usuario ou senha invalidos"
        if(usuarioAutenticado != null){
                //navergar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
        else{
            view.exibeMensagem("Usuário ou Senha Inválidos");
            
        }
      
       
        
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
        
        
    }
    
}
