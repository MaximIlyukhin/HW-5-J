import java.util.*;

/*Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
Написать программу, которая найдет 
и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. */

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anton");
        list.add("Ivan"); 
        list.add("Anton");
        list.add("Ivan");
        list.add("Peter"); 
        list.add("Ivan");
        list.add("Ivan");
        list.add("Ivan");
        list.add("Anton");

        Map<String, Integer> nameCount = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (nameCount.containsKey(list.get(i))) {
                nameCount.replace(list.get(i), nameCount.get(list.get(i)), nameCount.get(list.get(i)) + 1);
            } else {
                nameCount.put(list.get(i), 1);
            }
        }
        System.out.println(nameCount);
    }
}
