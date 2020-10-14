package homework4_task2;

import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        CollectionsFramework appCollectionsFramework = new CollectionsFramework();
        appCollectionsFramework.startAppCollectionsFramework();
    }

    public void startAppCollectionsFramework() {
        ArrayList<Integer> generatingNumbers = new ArrayList<>();
        for (int i = 1; i <= 100000; i++)
            generatingNumbers.add(i);
        Collections.shuffle(generatingNumbers); //перемешаем элементы списка
        //System.out.println(generatingNumbers);
        validateUniq(generatingNumbers);
        findDiviserNumber(generatingNumbers);

    }

    public void validateUniq(ArrayList<Integer> list){
        Set<Integer> setList = new HashSet<>();
        setList.addAll(list);
        if (setList.size() == list.size())
            System.out.println("Все элементы в данной коллекции уникальны");
        else
            System.out.println("Не все элементы в данной коллекции уникальны");
    }

    public  void findDiviserNumber(ArrayList<Integer> list){
        List<Integer> divider2 = new ArrayList<>();
        List<Integer> divider3 = new ArrayList<>();
        List<Integer> divider5 = new ArrayList<>();
        List<Integer> divider7 = new ArrayList<>();

        for (Integer i : list){
            if (i % 2 == 0){
                divider2.add(i);
            }
            else
                if (i % 3 == 0){
                    divider3.add(i);
            }
            else
                if (i % 5 == 0){
                    divider5.add(i);
            }
            else
                if (i % 7 == 0){
                    divider7.add(i);
            }
        }

        System.out.println("Делятся на 2: " + divider2);
        System.out.println("Делятся на 3: " + divider3);
        System.out.println("Делятся на 5: " + divider5);
        System.out.println("Делятся на 7: " + divider7);
    }

}
