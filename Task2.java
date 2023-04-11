// Пусть дан список сотрудников: 
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
// Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. 
// Для сортировки использовать TreeMap.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {        
        String[] people = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
         "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
          "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин",
           "Иван Ежов"};
        String info = String.join(" ", people);
        String[] arr = info.split(" ");       
        List<String> names = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if (i == 0 || i%2 == 0){
                names.add(arr[i]);
            }
        }       
        System.out.println(names);
        repeatNames(names);
        }

    static void repeatNames(List<String> names){
        Map<String, Integer> map = new TreeMap<>();           
        for(int i = 0; i < names.size(); i++){
            int count = 0;
            for(int j = 0; j < names.size(); j++){
                                               
                if(names.get(i).equals(names.get(j))){
                    count++;
                    map.put(names.get(i),count);
                }
            }
        }
        System.out.println(map);
    }
        
}

    

