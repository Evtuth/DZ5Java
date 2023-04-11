// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> telNumb = new HashMap<>();
        addInfoInMap(telNumb);
        addInfoInMap(telNumb);
        addInfoInMap(telNumb);
        addInfoInMap(telNumb);
        System.out.println(telNumb);
    }

    static void addInfoInMap(Map<String, String> map){        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String number = scanner.nextLine();
        System.out.println("Введите фамилию абонента: ");
        String name = scanner.nextLine();
        map.put(number, name);        
    }
}
