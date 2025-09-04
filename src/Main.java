import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var jogos = new ArrayList<Jogo>();

        while (true) {
            System.out.println("""
                    Bem vindo ao sistema de gerenciamento de jogos!
                    Digite a opção desejada:
                    1 - Cadastrar novo jogo
                    2 - Listar jogos cadastrados
                    3 - Remover jogo
                    4 - Sair
                    """);
            var scan = new Scanner(System.in);
            var opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do jogo que deseja cadastrar:");
                var titulo = scan.nextLine();
                System.out.println("Digite a plataforma do jogo:");
                var plataforma = scan.nextLine();
                System.out.println("Digite a data de lançamento do jogo (YYYY-MM-DD):");
                var dataLancamento = scan.nextLine();

                var jogo = new Jogo();
                jogo.título = titulo;
                jogo.plataforma = plataforma;
                jogo.dataLancamento = LocalDate.parse(dataLancamento);

                jogos.add(jogo);
                System.out.println("Jogo " + jogo + " cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Listando jogos cadastrados: ");
                var index = 1;
                for(var jogo : jogos) {
                    System.out.println(index + " - " + jogo);
                    index++;
                }
            }
            else if (opcao == 3){
                System.out.println("Digite o número do jogo que deseja remover:");
                var numJogo = scan.nextInt();
                scan.nextLine();
                jogos.remove(numJogo-1);
            }
            else if (opcao == 4)
                System.exit(0);
            else
                System.out.println("Opção inválida!");
        }
    }
}