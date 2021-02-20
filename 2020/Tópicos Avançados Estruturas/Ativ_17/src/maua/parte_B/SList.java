package maua.parte_B;

import java.util.LinkedList;
import java.util.List;

public class SList {
    public Node raiz=null;


    public void insereInicio(Integer key){
      Node novoNoh = new Node(key);
      if(this.raiz == null){this.raiz=novoNoh;}
      else{
          Node aux = this.raiz;
          while (aux.proximo!=null){
              aux = aux.proximo;
          }
          aux.proximo = novoNoh;
      }

}
    public static void printLista(SList lista){
      Node atual = lista.raiz;
        System.out.printf("[");

        while(atual!=null){
            System.out.printf(atual.dado+" ");

            atual = atual.proximo;
        }
        System.out.printf("]\n");
}
}
