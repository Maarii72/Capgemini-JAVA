/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Mari
 */
//mostrar tarefas
public class TaskTableModel extends AbstractTableModel {
    
    String[] columns = {"Nome", "Descri��o", "Prazo", "Tarefa Conclu�da", "Editar", "Excluir"};//defini��o colunas
    List<Task> tasks = new ArrayList();//defini��o lista de tarefas

    @Override // 3 m�todos obrigat�rios
    public int getRowCount() {//quantas linhas vai ter
        return tasks.size();
    }

    @Override
    public int getColumnCount() {//quantas colunas
        return columns.length;
    }
    
    @Override //retorna nome da coluna com base na coluna que foi pedida
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    //se � edit�vel a coluna (apenas a parte da tarefa true ou false)
    public boolean isCellEditable(int rowIndex, int columnIndex){
        //coluna 3 = tarefas
        return columnIndex == 3;
        /*if(columnIndex == 3)
            return true;
        else
            return false;
        */
    }
    
    //Check ma coluna - qual a classe do componente em determinada coluna(texto, int etc)
    @Override //tipos de cada coluna
    public Class<?> getColumnClass(int columnIndex){
        if(tasks.isEmpty()){ //verifica se a lista � vazia, se for vazia..
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();//retorna a classe do dado achado no caso boolean retorna um check
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//metodo que retorna linha e coluna espec�fica
    
        switch(columnIndex){
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados n�o encontrados";
        }
    }
    
    //check marcado ou n�o
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){//passado como um objeto
        tasks.get(rowIndex).setCompleted((boolean) aValue); //transforma de obj para boolean
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
