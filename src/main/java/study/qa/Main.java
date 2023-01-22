package study.qa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // массивы
        int[] array = new int[3]; // инициализация массива с типом int и длиной 3
        int[] numbers = {100, 150, -1, 90};

        System.out.println(numbers[2]); // обращение к элементу массива с индексом 2 (это элемент со значением -1)

        // циклы
        // for
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] != -1) {
                continue; // прерывает текущую и переходит на следующую итерацию в цикле
            }
            System.out.println("Нашли значение -1");
            break; // прерывает выполнение цикла
        }

        for (int i = numbers.length - 1; i >= 0; i--) { // тут демонстрируется перебор элементов массива в обратном порядке
            System.out.println(numbers[i]);
        }

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        int k = numbers.length - 1;
        while (k >= 0) {
            System.out.println(numbers[k]);
            k--;
        }

        int j = 0;
        do {
            // выполняется тело цикла
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);

        // перебор элементов массива или коллекции
        for(int number : numbers) {
            System.out.println(number);
        }

        // var args
        someMethod("Dima", "Petr");



        // Коллекции
        // Лист -  изменяемый массив
        List<String> stringList = new ArrayList<>(); // List - это интерфейс/соглашение, а ArrayList - конкретный класс, удовлетворяющий интерфейсу/соглашению
        stringList.add("Dima");
        stringList.addAll(Arrays.asList("Petr", "Ivan"));
        stringList.get(0);
        stringList.remove("Petr");
        stringList.size();
        stringList.contains("Dima");
        stringList.indexOf("Ivan");
        stringList.stream()
                .filter(s -> s.equals("ivan"));

        System.out.println(Arrays.stream(numbers).min());

        for (String name : stringList) {
            System.out.println(name);
        }


        // Сет - набор уникальных значений
        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(10);

        // Мэп - ключ-значение
        Map<Integer, Human> aMap = new HashMap<>();
        aMap.put(1515151515, new Human("Dima", 42, "M"));
        aMap.put(1515151514, new Human("Petr", 37, "M"));
        aMap.put(1515151513, new Human("Ivan", 25, "M"));

        for (Integer number: aMap.keySet()) {
            System.out.println(aMap.get(number));
        }

        Set<Map.Entry<Integer, Human>> entrySet = aMap.entrySet();
        for (Map.Entry<Integer, Human> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getName());
        }


    }

    public static String someMethod(String... args) {
        return "" ;
    }
}
