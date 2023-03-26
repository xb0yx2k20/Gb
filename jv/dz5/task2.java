package dz5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<String>();
        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Мария Рыкова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Иван Ежов");

        HashMap<String, Integer> nameCount = new HashMap<String, Integer>();

        for (String employee : employees) {
            if (nameCount.containsKey(employee)) {
                nameCount.put(employee, nameCount.get(employee) + 1);
            } else {
                nameCount.put(employee, 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCount.entrySet());
        sortedList.removeIf(entry -> entry.getValue() < 2);
        Collections.sort(sortedList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
