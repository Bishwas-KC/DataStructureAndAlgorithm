package searching.com;

public class BinarySearching {

    public static int binarySearch(int array[], int target) {

        int steps = 0;

        //set the first value of array start with zero
        int left = 0;

        //get the max index
        int right = array.length - 1;

        //In binary we need the mid value first+last/2
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                System.out.printf("Number of steps %s : %n", steps);
                return mid;
            } else if (array[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            steps++;
            System.out.println();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[200];
        for(int i =0;i<200;i++){
            array[i]=i;
        }
        int target = 0;
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not found");
        }
        {
            System.out.println("Element found in index : " + result);
        }

    }

}
