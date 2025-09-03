package arrayList;

import java.util.ArrayList;

public class SumOfEven {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(printEven(arr));
    }
    public static Integer printEven(ArrayList<Integer> arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            Integer element = arr.get(i);
            if(element % 2 == 0){
                sum = sum + element;
            }
        }
        return sum;
    }
}
