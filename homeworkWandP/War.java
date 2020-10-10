package homework.homeworkWandP;

import my.M;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class War {
//сделано только первых 3 пункта
    public static void main(String[] args) {

        String filePath = ("C:\\Users\\Рома\\Downloads/Война и мир_книга.txt");
        String text0 = readAllBytesJava7(filePath);
        String text = text0.replaceAll("[^А-я]", " ");
        String[] arrStr = text.split(" ");
        //System.out.println(Arrays.toString(arrStr));
        //System.out.println(putInHashSet(arrStr));
        //System.out.println(sortByValue(putInHashMap(arrStr)));

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm = putInHashMap(arrStr);
        hm = sortByValue(hm);
        for (Map.Entry<String, Integer> entry : hm.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value + " раз");
        }



    }

             //сортировка
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {    // скопировал
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =new LinkedList<>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {             //??
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // найти все уникальные слова и поместить их в коллекцию используя Set
    public static Set putInHashSet(String[] arrStr) {
        Set setUnical = new HashSet();
        for (int i = 0; i < arrStr.length; i++) {
            setUnical.add(arrStr[i]);
        }
        return setUnical;
    }


    //найти топ 10 слов и вывести количество этих слов используя Map
    public static HashMap putInHashMap(String[] arrStr) {
        int count = 0;
        HashMap map = new HashMap();
        for (int i = 0; i < arrStr.length; i++) {
            map.put(arrStr[i],0);
        }
        for (int i = 0; i <arrStr.length ; i++) {
            if(map.containsKey(arrStr[i]) && (arrStr[i].length() >= 1)) {
                map.put(arrStr[i],(int)map.get(arrStr[i]) + 1);

            }
        }
        return map;
    }


    private static String readAllBytesJava7(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }
}
