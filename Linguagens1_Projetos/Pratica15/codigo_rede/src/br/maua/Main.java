package br.maua;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
	// write your code here
//        LeituraJavaAte8();

        System.out.println("Escolha os dados que quer:\n1 - Overwatch\n2 - Pokemon\n3 - Yu Gi Oh\n0 - Sair");

        boolean flag = true;
        while (flag){
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    sc.nextLine();
                    System.out.println("Digite a plataforma (pc, etc)");
                    String plataforma = sc.nextLine();
                    System.out.println("Digite a regiao (us, eu, asia)");
                    String regiao = sc.nextLine();
                    System.out.println("Digite o nick do usuario");
                    String nick = sc.nextLine();
                    System.out.println("Agora o codigo dele");
                    String num = sc.nextLine();

                    String url ="https://ow-api.com/v1/stats/"+plataforma.toLowerCase()+"/"+regiao.toLowerCase()+"/"+nick+"-"+num+"/profile";
                    LeituraJavaAte11(url);
                    break;
                case 2:

                case 3:

                case 0:
                    System.out.println("Beleza, fui!!");
                    return;
                default:
                    System.out.println("Escolha de 1-3 ou 0 para sair.");
                    break;
            }
            continuar(flag);

        }

    }
    private static void continuar(boolean flag){
        System.out.println("\nVoce quer continuar? 1 - Sim; 2 - Nao");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                break;
            case 2:
                flag = false;
                break;
            default:
                flag = true;
                break;
        }

    }

    private static void LeituraJavaAte11(String url) throws Exception {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: "+response.statusCode());
        System.out.println("Recebidos: ");
        System.out.println(response.body());
    }

    private static void LeituraJavaAte8() throws Exception{
        URL url = new URL("https://viacep.com.br/ws/04042001/json/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int statusCode = con.getResponseCode();
        System.out.println("Status Code: "+statusCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        con.getInputStream()) );
        String result;
        StringBuffer content = new StringBuffer();
        while((result = in.readLine())!=null){
            content.append(result);
        }
        in.close();
        System.out.println("Recebidos: ");
        System.out.println(content);
    }
}
