package br.com.gustavof0ntz.todolist.task;

import java.time.LocalDateTime;

public class TaskModel {
    /**
     * ID da tarefa
     * Usuario (ID_USUARIO)
     * Descricao
     * Titulo
     * Data de inicio
     * Data de Termino da tarefa
     * Prioridade
     * 
     */

     private UUID id;
     private String description;
     private String title;
     private LocalDateTime startAt;
     private LocalDateTime endAt;
     private String priority;

     private LocalDateTime createdAt;
     
}
