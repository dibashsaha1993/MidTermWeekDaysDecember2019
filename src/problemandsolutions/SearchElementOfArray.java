package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    public static void main(String[] args) throws Exception {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int index=look(nums,20);
if(index>-1){
    System.out.println("Index found at: "+index);
}else{
    System.out.println("Invalid Index");
}
    }
    public static int look(int[] num2, int key) {
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

//done but needs review//
//element index confusion//