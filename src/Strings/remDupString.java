package Strings;

public class remDupString {
    public static void main(String[] args) {
        String s="javawe";
        String nodup="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean duplicate=false;
            for (int j = 0; j < nodup.length() ; j++) {
                if(nodup.charAt(j)==c){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate)
            {
                nodup+=c;
            }
        }
        System.out.println(nodup);
    }
}
