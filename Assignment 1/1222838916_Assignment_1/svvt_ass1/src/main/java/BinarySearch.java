package main.java;

public class BinarySearch {

    //Return the index of found value or return -1
    public int binarySearch(int[] data, int target) {
        int first = 0;
        int last = data.length - 1;

        int i = 0;
        while (first <= last) {
            System.out.println("Step Counter: " + (++i));
            int mid = (first + last) / 2;
            if (target == data[mid]) {
                return mid;
            } else if (target > data[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}