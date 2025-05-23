package br.com.facisa.arvorebinaria;

public class Arvore {
    Node raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node node, int valor) {
        if (node == null) {
            node = new Node(valor);
            return node;
        }
        if (valor < node.valor) {
            node.esquerda = inserirRec(node.esquerda, valor);
        } else {
            node.direita = inserirRec(node.direita, valor);
        }
        return node;
    }

    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println();
    }

    private void preOrdemRec(Node no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdemRec(no.esquerda);
            preOrdemRec(no.direita);
        }
    }
}