
class Produto implements Runnable {

    private int estoque = 5;

    public void run() {
        efetuarPedido();
    }

    public void efetuarPedido() {
        try {
            if (this.estoque > 0) {
                System.out.println("Pedido faturado para o cliente " + Thread.currentThread().getName());
                Thread.sleep(250);
                this.estoque--;
            } else {
                System.out.println("Não tem estoque para o cliente " + Thread.currentThread().getName());
            }
        } catch (Exception ex) {
        }
    }

    public Produto(int value) {
        this.estoque = value;
    }
}
