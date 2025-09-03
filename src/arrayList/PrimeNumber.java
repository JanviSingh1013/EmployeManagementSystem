package arrayList;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(primeList(arr));
    }
    public static ArrayList<Integer> primeList(ArrayList<Integer> arr){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer element = arr.get(i);
            if(checkPrime(element)){
                res.add(element);
            }
        }
        return res;
    }
    public static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i = i+2) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
