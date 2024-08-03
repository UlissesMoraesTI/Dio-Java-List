package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("*------------------*");

        listaTarefa.adicionarTarefa("Tarefa-001");
        listaTarefa.adicionarTarefa("Tarefa-001");
        listaTarefa.adicionarTarefa("Tarefa-002");
        listaTarefa.adicionarTarefa("Tarefa-003");
        listaTarefa.adicionarTarefa("Tarefa-004");
        listaTarefa.adicionarTarefa("Tarefa-005");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa-001");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
