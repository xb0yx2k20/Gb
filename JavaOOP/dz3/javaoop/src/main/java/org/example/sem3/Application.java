package org.example.sem3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1 - цифры\n2 - английские буквы\n3 - русские буквы\n(чтобы остановить игру напишите в любом месте leave)\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите игру: ");
        String num = scanner.nextLine();
        Game game = null;
        switch (num) {
            case "1" -> game = new NumberGame();
            case "2" -> game = new EnGame();
            case "3" -> game = new RuGame();
            case "leave" -> System.exit(0);
            default -> System.out.println("данная игра еще не добавлена!");
        }

        assert game != null;
        System.out.println("Выберите количество символов: ");
        String n11 = scanner.nextLine();
        System.out.println("Выберите количество попыток: ");
        String n22 = scanner.nextLine();
        if (n11.equals("leave") || n22.equals("leave")) {
            game.leaveGame();
        }
        int n1 = Integer.parseInt(n11);
        int n2 = Integer.parseInt(n22);
        game.start(n1, n2);

        Scanner scan = new Scanner(System.in);
        while (game.getGameStatus().equals(GameStatus.START)){
            System.out.print("Ваш ход: ");
            String answer = scan.nextLine();
            if (answer.equals("leave")) {
                game.leaveGame();
            }
            Answer answerGame = game.inputValue(answer);
            System.out.println("Коров - "+ answerGame.getCow()+" , быков - "+answerGame.getBull());
            n2--;
            if (n2 == 0) {
                game.changeGameStatus(GameStatus.LOSE);
            }
            if (answerGame.getBull().equals(n1)) {
                System.out.println(n1);
                game.changeGameStatus(GameStatus.WIN);
            }
        }

        if (game.getGameStatus().equals(GameStatus.WIN)) {
            System.out.println("Вы выиграли!");
        } else {
            System.out.println("Вы проиграли!");
        }

    }
}
