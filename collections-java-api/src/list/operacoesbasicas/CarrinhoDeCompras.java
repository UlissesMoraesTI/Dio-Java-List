package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Compras> comprasList;

    public CarrinhoDeCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void adicionarCompras(String compras) {
        comprasList.add(new Compras(compras));
    }

    public void removerCompras(String compras) {
        List<Compras> comprasParaRemover = new ArrayList<>();
        for (Compras c : comprasList) {
            if (c.getCompras().equalsIgnoreCase(compras)) {
                comprasParaRemover.add(c);
            }
        }
        comprasList.removeAll(comprasParaRemover);
    }

    public int obterQuantidadeCompras() {
        return comprasList.size();
    }

    public void obterDescricaoCompras() {
        System.out.println(comprasList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarCompras("Arroz");
        carrinhoDeCompras.adicionarCompras("Feijão");
        carrinhoDeCompras.adicionarCompras("Macarrão");
        carrinhoDeCompras.adicionarCompras("Ovos");
        carrinhoDeCompras.adicionarCompras("Ovos");
        carrinhoDeCompras.adicionarCompras("Ovos");
        System.out.println("QTDE: " + carrinhoDeCompras.obterQuantidadeCompras());
        carrinhoDeCompras.obterDescricaoCompras();

        carrinhoDeCompras.removerCompras("Ovos");
        System.out.println("QTDE: " + carrinhoDeCompras.obterQuantidadeCompras());
        carrinhoDeCompras.obterDescricaoCompras();
    }
}
