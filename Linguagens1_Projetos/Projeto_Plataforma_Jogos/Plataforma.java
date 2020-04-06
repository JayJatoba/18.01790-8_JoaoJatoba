import java.util.ArrayList;
import java.util.Scanner;

public class Plataforma {
    private ArrayList<Conta> contas;
    private static boolean ligado;

    private static final String nick = "";
    private static final String key = "";
    private static final String mail = "";


    public boolean isLigado() {
        return ligado;
    }

    public Plataforma(boolean ligado){
        this.ligado = this.isLigado();
        contas = new ArrayList<>();
    }
    
    public void FaceInicial(){

        // Conta sem nick, ou senha ou nada.
        // Ela sera trocada com valores depois.

        boolean sim = true;


        Scanner scanner = new Scanner(System.in);
        String nome, genero, descricao;
        System.out.println("O que voce quer fazer? ");
        System.out.println("\n1- Criar conta;\n2- Logar conta;\n3- Sair da plataforma");

        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                // Quando quer criar usuario novo
                
                Usuario u1 = new Usuario(nick, key, mail);
                u1.Novo();
                Conta c1 = new Conta(u1);
                while (sim) {
                    System.out.println("E agora, o que fazer? ");
                    System.out.println("\n1- Adicionar jogo.\n2- Adicionar creditos.\n3- Ver dados da conta.");
                    
                    System.out.println("Informe nome, genero, descricao: ");
                    nome = scanner.nextLine();
                    genero = scanner.nextLine();
                    descricao = scanner.nextLine();
    
                    Jogo j1 = new Jogo(nome, genero, descricao);
                    // System.out.println("J1:" + j1.getInfo());
                    c1.addJogo(j1);
                    c1.getInfo();

                    // for (Conta cada: contas){
                    //     if (cada.Nick().equals(u1.getNickname())){
                    //         cada.getInfo();
                    //     }
                    // }

                    
                    sim = false;
                } 
                 
                break;
            
            case 2: 
                System.out.println("");
                break;
            default:
                System.out.println("");
                this.ligado = false;
                break;}
            
            
        // Quando quer adicionar jogo a conta logada


        
        // System.out.println("Informe nome, genero, descricao: ");
        // nome = scanner.nextLine();
        // genero = scanner.nextLine();
        // descricao = scanner.nextLine();
    
        // Jogo j1 = new Jogo(nome, genero, descricao);
        // System.out.println("J1:" + j1.getInfo());
        // c1.addJogo(j1);



        
        scanner.close();
    }
    

    

}