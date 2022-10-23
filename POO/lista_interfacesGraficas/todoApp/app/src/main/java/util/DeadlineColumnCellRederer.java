/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author Mari
 */
//redenrizador das células da jtable(colorir a tabela)
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer{
    
    @Override //metodos implementados
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        label.setHorizontalAlignment(CENTER); //centralizar os componentes da tabela
        //pintar o deadline de acordo com a data da tarefa
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        //pegar a tarefa do taskmodel em determinada linha que vai ser redenrizada
        Task task = taskModel.getTasks().get(row);
        if(task.getDeadline().after(new Date())){ //se a data for depois de (hoje)
            label.setBackground(Color.GREEN);
        }else{
            label.setBackground(Color.RED);
        }
        return label;
    }
}
