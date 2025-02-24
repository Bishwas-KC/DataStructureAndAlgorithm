package searching.com;

public class BinarySearching {

    public static int binarySearch(int array[],int target){
        //set the first value of array start with zero
        int low = 0;

        //get the max index
        int high = array.length-1;

        //In binary we need the mid value first+last/2
        int midIndex=array[low]+array[high]/2;
        int midValue=array[midIndex];


        if(midValue==target){
            return midValue;
        }else if(midValue>target){
            // we have to search in left side from midvalue
            high = midIndex-1;
            low = 0;
        }
    }

}
