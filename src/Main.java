import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var catalogo = new ArrayList<Conteudo>();
        var scan = new Scanner(System.in);
        var jogoService = new JogoService();

        while (true) {
            System.out.println("""
                        Bem vindo ao sistema de gerenciamento de mídias!
                        Digite o conteúdo que deseja gerenciar:
                        1 - Jogos
                        2 - Filmes
                        3 - Series
                    """);
            var conteudoOpcao = scan.nextInt();
            scan.nextLine();
            if (conteudoOpcao == 1) {
                System.out.println("-----------------------------------");
                System.out.println("""
                        Digite a opção desejada:
                        1 - Cadastrar novo jogo
                        2 - Listar jogos cadastrados
                        3 - Remover jogo
                        4 - Sair
                        """);

                var opcao = scan.nextInt();
                scan.nextLine();

                switch (opcao) {
                    case 1 -> jogoService.AdicionarJogo(scan, catalogo);
                    case 2 -> jogoService.ListarJogos(catalogo);
                    case 3 -> jogoService.RemoverJogo(scan, catalogo);
                    case 4 -> System.exit(0);
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }
}