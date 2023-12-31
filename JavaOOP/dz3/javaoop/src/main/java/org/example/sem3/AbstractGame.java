package org.example.sem3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord=sizeWord;
        this.attempts=attempts;
        word = generateWord();
        //System.out.println(word);//слово загаданное пк
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            char character = value.charAt(i);
            if (word.contains(Character.toString(character))) {
                cows++;
            }
        }
        cows -= bulls;
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public void changeGameStatus(GameStatus gameStatus) {
        this.gameStatus=gameStatus;
    }

    public void leaveGame() {
        System.out.println("Игра прервана пользователем!");
        System.exit(0);
    }
    private String generateWord() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWorld = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWorld = resWorld.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWorld;
    }

    abstract List<String> generateCharList();
}
