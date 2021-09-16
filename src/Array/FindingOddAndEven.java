package Array;

public class FindingOddAndEven {
    public static void main(String[] args) {
        int[] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93};
        int sumOdd=0;
        int sumEven=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
                sumEven+=array[i];
            }else {
                sumOdd+=array[i];
            }
        }
        System.out.println(sumOdd-sumEven);

    }
}
