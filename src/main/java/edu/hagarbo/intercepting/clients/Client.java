package edu.hagarbo.intercepting.clients;

import edu.hagarbo.intercepting.tarefas.ProgramadorTarefas;

public interface Client {

    public void setProgramadorTarefas(ProgramadorTarefas programadorTarefas);

    public void enviarPeticion(String peticion);
}
