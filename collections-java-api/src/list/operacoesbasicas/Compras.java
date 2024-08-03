package list.operacoesbasicas;

public class Compras {

    private String compras;

    public Compras(String compras) {
        this.compras = compras;
    }

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compra) {
        this.compras = compra;
    }

    @Override
    public String toString() {
        return compras;
    }
}
