import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0&&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;

            
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
