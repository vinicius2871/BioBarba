/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.servico;
import Model.usuario;

/**
 *
 * @author PICHAU
 */
public class Main {
    
    public static void main(String[] args){
        
        String nome = "thiago";
        System.out.println(nome);
        
        servico Servico = new servico(1, "Barba", 30);
    
        System.out.println(Servico.getDescricao());
        System.out.println(Servico.getValor());
        
        Cliente cliente = new Cliente(1, "tiago", "rua teste", "9778451115");
        System.out.println(cliente.getNome());
        
        usuario Usuario = new usuario(1, "barbeiro", "senha");
        System.out.println(Usuario.getNome());
                
        Agendamento agendamento = new Agendamento(1, cliente, Servico, 30, "19/06/2020 09:15 ");
        System.out.println(agendamento.getCliente().getNome());
                
}
    
}
