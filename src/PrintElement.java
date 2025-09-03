import java.util.ArrayList;

public class PrintElement {
    public static void main(String[] args) {
        ArrayList  arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        print(arr);
    }
    public static void print(ArrayList  arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
