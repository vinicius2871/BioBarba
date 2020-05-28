/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author PICHAU
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //Buscar uma lista com os agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();    
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir essa lista na view
        helper.preecherTabeela(agendamentos);
    }
    
    public void atualizaCliente(){
    
        //Buscar Clientes do Banco de Dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir Clientes no Combobox cliente
        helper.preencherClientes(clientes);
        
    }
    
    public void atualizaServico(){
    
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    public void atualizaValor(){
    
       servico Servico = helper.obterServico();
       helper.setarValor(Servico.getValor());
    }
    
     public void agendar(){
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        //Salvar Objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);
        //Inserir elemento na tabela
        atualizaTabela();
        helper.limparTela();
    }
    
}
