package br.maua;

import java.util.LinkedList;
import java.util.Queue;



public class Nohs {
    protected int item;
    public Nohs noh_pai;
    public Nohs noh_direita;
    public Nohs noh_esquerda;

    public Nohs(int item) {
        this.item = item;
        
        noh_pai = null;
        noh_direita= null;
        noh_esquerda=null;
    }
    public static void preOrder(Nohs ponteiro){
        System.out.println(ponteiro.getItem());
        if(ehEsquerdo(ponteiro)){
            preOrder(ponteiro.noh_esquerda);
        }
        if (ehDireito(ponteiro)) {
            preOrder(ponteiro.noh_direita);
        }
    }
    public static void posOrder(Nohs ponteiro){
        if(ehEsquerdo(ponteiro)){
            posOrder(ponteiro.noh_esquerda);
        }
        if (ehDireito(ponteiro)) {
            posOrder(ponteiro.noh_direita);
        }
        System.out.println(ponteiro.getItem());
    }
    public static void inOrder(Nohs ponteiro){
        if(ehEsquerdo(ponteiro)){
            inOrder(ponteiro.noh_esquerda);
        }
        System.out.println(ponteiro.getItem());
        if (ehDireito(ponteiro)) {
            inOrder(ponteiro.noh_direita);
        }
    }

    public static void multDois(Nohs ponteiro){
        if(ponteiro.getItem()%2==0){
            System.out.println(ponteiro.getItem());}
        if(ehEsquerdo(ponteiro)){
            multDois(ponteiro.noh_esquerda);
        }
        if (ehDireito(ponteiro)) {
            multDois(ponteiro.noh_direita);
        }
    }

    public static boolean procuraValor(Nohs ponteiro,int valor,int nivel){
        if(ponteiro.getItem()==valor){
            System.out.println("Valor "+valor+" encontrado no nivel "+nivel);
            return true;
        }
        else if(ehEsquerdo(ponteiro) &&ponteiro.getItem()>valor){
            nivel+=1;
            return procuraValor(ponteiro.noh_esquerda,valor,nivel);
        }
        
        else if (ehDireito(ponteiro) &&ponteiro.getItem()<valor) {
            nivel+=1;
            return procuraValor(ponteiro.noh_direita, valor,nivel);
        }
        
        return false;
    }

    public static void insereValor(Nohs ponteiro,int valor, Noh_Raiz raiz){
        if (procuraValor(ponteiro, valor, 0)){
            System.out.println("Elemento "+valor+" ja existente na arvore.");
            raiz.setTamanho(raiz.getTamanho()+1);
            return;
        }
        else{
            if(ponteiro.noh_esquerda==null && ponteiro.getItem()>valor){
                ponteiro.noh_esquerda=new Nohs(valor);
                ponteiro.noh_esquerda.noh_pai=ponteiro;
                System.out.println("Valor "+valor+" adicionado com sucesso.");
            }
            else if(ponteiro.noh_direita==null && ponteiro.getItem()<valor){
                ponteiro.noh_direita=new Nohs(valor);
                ponteiro.noh_direita.noh_pai=ponteiro;
                System.out.println("Valor "+valor+" adicionado com sucesso.");
                
            }
            else if(ehEsquerdo(ponteiro) && ponteiro.getItem()>valor){
                insereValor(ponteiro.noh_esquerda,valor,raiz);
            }
            
            else if (ehDireito(ponteiro) && ponteiro.getItem()<valor) {
                insereValor(ponteiro.noh_direita, valor,raiz);
            }


        }
          
    }
    public static int quantidadeNohs(Nohs ponteiro)  
    { 
        Queue<Nohs> queue = new LinkedList<Nohs>(); 
         
        queue.add(ponteiro); 
        int contagem=0; 
        
        while (!queue.isEmpty())  
        {
            Nohs temp = queue.poll(); 
            
            contagem++; 
            
            if (temp.noh_esquerda != null)  
            { 
                queue.add(temp.noh_esquerda); 
            } 
             
            if (temp.noh_direita != null)  
            { 
                queue.add(temp.noh_direita); 
            } 
        } 
        return contagem;
    } 
    public static int quantidadeNulls(Nohs ponteiro)  
    { 
        Queue<Nohs> queue = new LinkedList<Nohs>(); 
         
        queue.add(ponteiro); 
        int contagem=0; 
        
        while (!queue.isEmpty())  
        {
            
            Nohs temp = queue.poll(); 
            
            
            if (temp.noh_pai==null){
                contagem++; 
            }
            if (temp.noh_direita==null){
                contagem++;
            }
            if (temp.noh_esquerda==null){
                contagem++;
            }
            if (temp.noh_esquerda != null)  
            { 
                queue.add(temp.noh_esquerda); 
            } 
             
            if (temp.noh_direita != null)  
            { 
                queue.add(temp.noh_direita); 
            } 
        } 
        return contagem;
    } 
    


    public static boolean ehEsquerdo(Nohs ponteiro){
        if(ponteiro.noh_esquerda==null)
            return false;
        return true;
    }

    public static boolean ehDireito(Nohs ponteiro){
        if(ponteiro.noh_direita==null)
            return false;
        return true;}

    public int getItem() {
        return item;
    }
}