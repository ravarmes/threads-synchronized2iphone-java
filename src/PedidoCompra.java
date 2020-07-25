
public class PedidoCompra {

    public static void main(String[] args) {
        Produto p = new Produto(5);
        Thread[] t = new Thread[15];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(p);
            t[i].setName("Cliente: " + i);
            t[i].start();
        }
    }
}
