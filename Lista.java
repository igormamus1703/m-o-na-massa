public class ListaEncadeada {
    private Node lista;

    // Construtor
    public ListaEncadeada() {
        lista = null;
    }

    // Classe interna Node que representa cada elemento da lista
    private class Node {
        private Integer informacao;
        private Node proximo;

        // Construtor do Node
        public Node() {
            informacao = null;
            proximo = null;
        }
    }

    // Método para inserir um novo elemento na lista
    public void inserir(int valor) {
        Node novoNo = new Node();
        novoNo.informacao = valor;

        if (lista == null) {
            lista = novoNo;
        } else {
            Node temp = lista;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
        }
    }

    // Método para imprimir os elementos da lista
    public void imprimir() {
        Node temp = lista;
        while (temp != null) {
            System.out.print(temp.informacao + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }
}
