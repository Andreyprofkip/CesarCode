

public class Decoderr {
    private String strTextForDecoding = null;
    private String strAlphabet = null;
    private Integer sdvig = 0;

    public Decoderr(String a, String b) {
        this.strTextForDecoding = a;
        this.strAlphabet = b;
    }

    public char[] decoding(Integer c){
        char[] text = strTextForDecoding.toLowerCase().toCharArray();
        char[] alphabet =strAlphabet.toCharArray();
        for(int i = 0; i < text.length; i++){
            for (int j = 0; j < alphabet.length-1; j++){
                if (alphabet[j] == text[i]){
                    if (j+c < alphabet.length){
                        text[i] = alphabet[j+c];
                        break;
                    } else {
                        text[i] = alphabet[j+c-alphabet.length];
                        break;
                    }
                }
            }
        }
        return text;
    }
}
