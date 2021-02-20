import java.util.Scanner;

/**
 * Usuario
 */
public class Usuario {

    private String nickname, password, email;

    public Usuario(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public void Novo(){
        Scanner sc = new Scanner(System.in);
        String senha = "";
        String mail = "";
        
        System.out.println("Informe seu username: ");
        this.nickname = sc.nextLine();
        System.out.println("Informe sua senha: ");
        this.password = sc.nextLine();
        while (!validarSenha(senha)){
            System.out.println("Confirme sua senha: ");
            senha = sc.nextLine();
        }
        System.out.println("Informe seu email: ");
        
        this.email = sc.nextLine();
        while (!validarEmail(mail)){
            System.out.println("Confirme seu email: ");
            
            mail = sc.nextLine();
        }
        System.out.println("Novo usuario criado com sucesso.");
        
        
    }
 
    
    public boolean validarSenha(String senha){
        return senha.equals(password);
    }

    public boolean validarEmail(String mail){
        return mail.equals(email);
    }

    public String getNickname(){
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    

    


}