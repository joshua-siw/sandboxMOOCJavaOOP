import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e", "more precisely");

        Programm.printKeys(hashMap);
        System.out.println("---");
        Programm.printKeysWhere(hashMap, "i");
        System.out.println("---");
        Programm.printValuesOfKeysWhere(hashMap, ".e");
    }
}