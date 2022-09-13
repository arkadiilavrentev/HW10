import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Работа в классе
//        ArrayList<String> strings= new ArrayList<>();
//        strings.add("Привет");
//        strings.add("меня");
//        strings.add("зовут");
//        strings.add("Массив");
//
//        strings.add(1, "не");
//
//        for (String str : strings){
//            System.out.println(str);
//        }
//
//        LinkedList<String> linkedStrings = new LinkedList<>();
//        linkedStrings.add("Привет");
//        linkedStrings.add("меня");
//        linkedStrings.add("зовут");
//        linkedStrings.add("Массив");
//
//        linkedStrings.add(1, "не");
//
//        for (String str : linkedStrings){
//            System.out.println(str);
//        }
/*
        Iterator<String> iterator = new Iterator<String>() {


            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };

 */
//
//        ArrayList<Dog> dogs = new ArrayList<>();
//
//        for (int i = 1; i < 100; i++) {
//            Dog dog = new Dog();
//            dog.height = i;
//            dogs.add(dog);
//        }
//
//        DogScanner dogScanner = new DogScanner();
//        dogScanner.scanDogs(dogs);

        // Домашняя работа

        System.out.println("Домашнее задание: ArrayList");
        ArrayList<FizMatMarcs> marcs = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {                 // Генерирует структуру с школьными оценками
            FizMatMarcs marc = new FizMatMarcs();
            marc.mark = 5;
            if(i % 3 == 0){
                marc.mark=3;
            }
            marcs.add(marc);
        }

        MarcsChecker marcsChecker = new MarcsChecker();
        marcsChecker.scanMarcs(marcs);                   // Выводит данные структуры

        marcsChecker.goodTeacher(marcs);              // Удаляет плохие оценки
        marcsChecker.scanMarcs(marcs);

        System.out.println("Домашнее задание: LinkedList");
        LinkedList<TreeHeight> treeHeights = new LinkedList<>();

        for(int i = 0; i < 20; i++){                     // Генерирует структуру с высотами деревьев
            TreeHeight tree = new TreeHeight();
            tree.height=i+1;
            treeHeights.add(tree);
        }

        WoodCutter woodCutter = new WoodCutter();
        woodCutter.woodCheck(treeHeights);               // Выводит данные структуры

        woodCutter.woodCut(treeHeights);                 // "Срубает" деревья, высота которых больше 8
        woodCutter.woodCheck(treeHeights);
    }
}