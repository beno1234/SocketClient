
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.print("Coloque seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();

        try(Socket socket = new Socket("localhost", 8089);
            BufferedReader leitor = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true)
        ){


            escritor.println(usuario);

            Thread receptor = new Thread(() -> {
                try {
                    String mensagemRecebida;
                    while ((mensagemRecebida = leitor.readLine()) != null) {
                        System.out.println(mensagemRecebida);
                    }
                } catch(IOException ioException) {
                    System.out.println("Socket ja finalizou");

                }
            });
            receptor.start();

            while(true) {
                Thread.sleep(300);
                System.out.print("Escreva uma mensagem: ");
                String mensagem = scanner.nextLine();

                if(mensagem.equalsIgnoreCase("sair")) break;

                escritor.println(mensagem);
            }
            System.out.println("saindo do chat... ");
            receptor.interrupt();

        }catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}