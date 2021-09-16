package loop;

public class CountLetters {
    public static void main(String[] args) {
        String word="I want to solve this question by myself this time";
        int index=0;
        int count = 0;
        while(index<word.length()){
            if (word.charAt(index)== 'i' || word.charAt(index)=='I'){
                count++;
            }
            index++;
        }
        System.out.println("There are "+count+" in this sentence");
    }
}
