package edu.hagarbo.intercepting.clients;

import edu.hagarbo.intercepting.tarefas.ProgramadorTarefas;

public class Mollapp implements Client {

    private ProgramadorTarefas programadorTarefas;

    public Mollapp() {
    }

    @Override
    public void setProgramadorTarefas(ProgramadorTarefas programadorTarefas) {
        this.programadorTarefas = programadorTarefas;
    }

    @Override
    public void enviarPeticion(String peticion) {
        this.programadorTarefas.executarTarefas(peticion);
    }

}
