/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
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
}
