import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        if (s == null || s == "") return null;
        StringBuilder sb = new StringBuilder();
        Boolean nextCapital = false;

        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                char tmp = s.charAt(i);
                if(nextCapital) tmp = Character.toUpperCase(tmp);
                sb.append(tmp);
                nextCapital= false;
            }
            else{
                nextCapital=true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}
