package Array;

public class uniqueFindinNumbers {
    public static void main(String[] args) {
        int [] number={4,4,5,12,6,7,12,7,1,1,2,2,3};
        String unique="";
        for (int i=0;i<number.length;i++){
            boolean isUnique=true;
            for (int k=0;k<i;k++){
                if(number[i]==number[k]){
                    isUnique=false;
                }
            }
            if (isUnique){
                unique+=number[i]+",";
            }
        }
        System.out.println(unique);
    }
}
