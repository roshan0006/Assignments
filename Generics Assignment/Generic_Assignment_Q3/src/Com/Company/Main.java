package Com.Company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer arr[] = {1,2,3,4,5};
        Generic<Integer> objGeneric = new Generic<>();
        Integer[] arr1=objGeneric.swap(arr, 0, 3);
        for(int i : arr1) {
            System.out.println(i);
        }

    }
}
