import java.util.Arrays;

public class Sorting {
  /*  private int[] temp;

    public static void main(String[] args) {
        int [] data = {2, 5, 3, 4, 1};
        int[] temp = {2,5,3,4,1};
        Sorting mySort = new Sorting();
        //insertionSort
        //bubbleSort
        //selectionSort
        mySort.mergeSort(data, 0, data.length-1);
        System.out.println(Arrays.toString(data));


    }

    //split by half the array
    //base case; loop until no more halves available
    //"merge" <=> "swap"
    //helperFunction merge look at the beginning of each sub array
    void mergeSort(int[]data, int lo, int hi){
        if(temp == null){
            temp = new int[data.length];
        }
        if(hi<= lo){
            return;
        }
        int midpoint = (hi+lo)/2;
        mergeSort(data, lo, midpoint);
        //[single left]
        mergeSort(data, midpoint = 1, hi);
        //[single right]
        //merge(array, lo, midpoint, hi)
        merge(data, lo,midpoint, hi);

    }


    //insertion sort
    //start at i-th position
    //scan all to the left
    //swap if smaller
    //otherwise break

    void insertionSort(int[] data){
        for(int i = 1; i< data.length; ++i){
            for(int j=i; j>0; --j){
                if (data[j] < data[j-1]){
                    swap(j, j-1, data);
                }else{
                    break;
                }
            }
        }
        //end time
        //total = end-start
    }

    public void bubbleSort(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j <;) {
                if ( data[j] > data.length - 1 - i;++j){
                    if (data[i] > data[j + 1]) {
                        swap(j, j + 1, data);
                    }

                }
            }
            //loop through data
            //assume current location is the smallest
            //search for the smallest value
            //swap current with the smallest value
            void selectionSort ( int[] data){
                for (int i = 0; i < data.length; ++i) {
                    int smallestIndex = i;
                    for (int j = i + 1; j < data.length; ++j) {
                        if (data[j] < data[i]) {
                            smallestIndex = j;
                        }
                    }
                    swap(smallestIndex, i, data);
                }
            }

        }
    }
    public void swap ( int i, int j, int[] array){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void merge (int[]array, int lo, int mid, int hi){
        int i = lo, j = mid + 1;//create pointers to left
                                //of sub array

        for (int k = lo; k<=hi; ++k){
            temp[k]= data[k];
        }
        for (int k = lo; k<= hi; ++k){
            //check is the left sub array exhausted
            //is the right subarray exhausted
            //if the right subarray is less than the left subarray
            //else eqauls

            if (i>mid)//no elements left in subarray
                array[k] = temp[j++];
            else if (j>hi)//no elements
                array[k] = temp[i++];
            else if (temp[j]<temp[i])
                array[k] = temp[j++];
            else
                array[k] = temp[i++];
        }
    }*/
}
