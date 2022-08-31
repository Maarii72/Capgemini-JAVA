/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

/**
 *
 * @author Mari
 */
public class Main {
    public static void main(String[] args){
        
        /*
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");
        projectController.save(project);
        */
        /*
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("projeto teste");
        project.setDescription("description");
        projectController.save(project);
        */
        
        //projectController.removeById(3);
        
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de projetos: " + projects.size());
        
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        task.setIdProject(4);
        task.setName("CRiar as telas da aplicação");
        task.setDescription("Devem ser criadas as telas para os cadastros");
        task.setNotes("sem notas");
        task.setCompleted(false);
        task.setDeadline(new Date());
        
        taskController.save(task);
    }
}
