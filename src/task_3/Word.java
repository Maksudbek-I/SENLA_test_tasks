package task_3;

public class Word implements Comparable<Word> {
    private String word;
    private int number = 0;
    void count (String word){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i)=='а'||word.charAt(i)=='у'||word.charAt(i)=='о'||word.charAt(i)=='ы'||
                    word.charAt(i)=='э'|| word.charAt(i)=='е'||word.charAt(i)=='ё'||
                    word.charAt(i)=='и'||word.charAt(i)=='ю'||word.charAt(i)=='я'){
                number++;
                if (i == 0){
                    char c =(char)((int) word.charAt(i) - 32);
                    word = c + word.substring(1);

                }
            }
        }
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Word o) {
        if(number==o.getNumber())
            return 0;
        if(number<o.getNumber())
            return 1;
        if(number>o.getNumber())
            return -1;

        return 0;
    }
}
