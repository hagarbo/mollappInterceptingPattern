package edu.hagarbo.intercepting.tarefas;

import edu.hagarbo.intercepting.filtros.Filtro;
import edu.hagarbo.intercepting.targets.Target;

public class ProgramadorTarefas {

    private Target target;
    private Tarefas tarefas;

    public ProgramadorTarefas(Target target) {
        this.target = target;
        this.tarefas = new Tarefas();
    }

    public Tarefas getTarefas() {
        return this.tarefas;
    }

    public void setTarefa(Filtro filtro) {
        this.tarefas.engadirTarefa(filtro);
    }

    public void executarTarefas(String s) {
        this.tarefas.execucion(s);
        this.target.execucion(s);
    }
}
