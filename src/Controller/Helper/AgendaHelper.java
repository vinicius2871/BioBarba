/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PICHAU
 */
public class AgendaHelper implements IHelper{

   
    private final Agenda view;
    
    
    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preecherTabeela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
        
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservação()
               
        });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServicos(ArrayList<servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxServico().getModel();
        
        for (servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }
        //pega o cliente selecionada
     public Cliente obterCliente() { 
       return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }
        //pega o serviço selecionado
    public servico obterServico() { 
       return (servico) view.getJComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
          view.getTextValor().setText(valor+"") ;
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        servico Servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, Servico, valor, dataHora, observacao);
        return agendamento;
        
    }

    @Override
    public void limparTela() {
        view.getTextId().setText(" ");
        view.getTextFormatedData().setText(" ");
        view.getTextFormatedHora().setText(" ");
        view.getTextObservacao().setText(" ");
    }
    
}
