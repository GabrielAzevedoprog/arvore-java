package br.com.facisa.arvorebinaria;

public class Main {
    public static void main() {
        Arvore arvore = new Arvore();
        int[] valores = {10, 5, 2, 7, 15, 12, 20};

        for (int v : valores) {
            arvore.inserir(v);
        }

        System.out.println("Valores em pré-ordem:");
        arvore.preOrdem();
    }
}
