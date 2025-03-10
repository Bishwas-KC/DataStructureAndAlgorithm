package searching.com;

public class linearSearching {

    public static int linearSearching(int[] array, int target) {
        int steps = 0;

        for (int i = 0; i < array.length-1; i++) {
            steps++;
            if (array[i] == target) {
                System.out.println("Number of steps : "+steps);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = new int[200];
        for(int i =0;i<=200;i++){
            array[i]=i;
        }
        int target = 199;
        int result = linearSearching(array, target);
        if(result == -1){
            System.out.println("Element not found!!");
        }else{
            System.out.println("Element found in index : "+result);
        }
    }
}
