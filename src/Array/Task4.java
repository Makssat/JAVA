package Array;

public class Task4 {
    public static void main(String[] args) {
        int numbers[]={14,21,6,5,74,25,9,84,16,15,15};
        for(int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==30){
                    System.out.println(numbers[j] +"+"+numbers[i]);

                }
            }
        }
    }
}
