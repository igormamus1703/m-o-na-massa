import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números inteiros para inserir na lista (digite 0 para parar):");
        while (true) {
            int entrada = scanner.nextInt();
            if (entrada == 0) {
                break;
            }
            listaEncadeada.inserir(entrada);
        }

        System.out.println("Itens inseridos na lista:");
        listaEncadeada.imprimir();
    }
}
