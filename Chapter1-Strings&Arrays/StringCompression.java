public class StringCompression {
    public static void main(String[] args) {
        String betterComp = "aaaaaaaabbbbbbbbddddddddi";
        String worseComp = "aovudhwhvprjv";

        System.out.println(chooseShorter(betterComp));
        System.out.println(chooseShorter(worseComp));
    }   
    
    public static String chooseShorter(String input){
        String compressed = compressString(input);
        if (input.length()<= compressed.length()) return input;
        else return compressed; 
    }

    public static String compressString(String input){
        String compressed = new String();
        int countTemp = 1;
        char charTemp = input.charAt(0);

        for (int i = 1; i < input.length(); i++){
            if (input.charAt(i) == charTemp)  countTemp++;
            else {
                compressed = compressed + charTemp + countTemp;
                charTemp = input.charAt(i);
                countTemp = 1;
            } 
        }
        compressed = compressed + charTemp + countTemp;
        return compressed;
    }
}


