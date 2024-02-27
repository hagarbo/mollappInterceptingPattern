package edu.hagarbo.intercepting.tarefas;

import java.util.ArrayList;

import edu.hagarbo.intercepting.filtros.Filtro;
import edu.hagarbo.intercepting.targets.Target;

public class Tarefas {

    private Target target;
    private ArrayList<Filtro> filtros = new ArrayList<>();

    public Tarefas() {
    }

    public ArrayList<Filtro> getTarefas() {
        return this.filtros;
    }

    public Target getTarget() {
        return this.target;
    }

    public void engadirTarefa(Filtro filtro) {
        this.filtros.add(filtro);
    }

    public void execucion(String s) {
        this.filtros.forEach(e -> e.execucion(s));
    }

    public void setTarget(Target target) {
        this.target = target;
    }

}
