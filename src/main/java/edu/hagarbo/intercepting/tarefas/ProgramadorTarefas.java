package edu.hagarbo.intercepting.tarefas;

import edu.hagarbo.intercepting.filtros.Filtro;
import edu.hagarbo.intercepting.targets.Target;

public class ProgramadorTarefas {

    private Tarefas tarefas;

    public ProgramadorTarefas(Target target) {
        this.tarefas = new Tarefas();
        this.tarefas.setTarget(target);
    }

    public Tarefas getTarefas() {
        return this.tarefas;
    }

    public void setTarefa(Filtro filtro) {
        this.tarefas.engadirTarefa(filtro);
    }

    public void executarTarefas(String s) {
        this.tarefas.execucion(s);
        this.tarefas.getTarget().execucion(s);
    }
}
