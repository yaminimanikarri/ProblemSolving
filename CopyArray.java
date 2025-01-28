package problemSolvingEasy;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("arr1: ");
        for (int i : arr1) {
            System.out.println(i + " ");
        }
        System.out.println("arr2: ");
        for (int i : arr2) {
            System.out.println(i + " ");
        }
    }


}
