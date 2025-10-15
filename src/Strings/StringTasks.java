package Strings;

public class StringTasks {
    public static void main(String[] args) {

        //COUNT VOWELS AND CONSONANTS
        String p1String = "it is a Valid Question";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < p1String.length(); i++) {
            p1String = p1String.toLowerCase();
            char c = p1String.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : " + vowels + " Consonants: " + consonants);

        //PALINDROME OR NOT
        String p2String = "malayalam";
        String p2rev = "";
        for (int i = 0; i < p2String.length(); i++) {
            p2rev = p2rev + p2String.charAt(i);
        }
        if (p2String.equals(p2rev)) {
            System.out.println("THE GIVEN STRING IS PALINDROME.");
        } else {
            System.out.println("THE GIVEN STRING IS NOT A PALINDROME.");
        }


        //REVERSE A STRING
        String p3String = "MIKASA";
        String p3rev = "";
        for (int i = p3String.length()-1; i >=0; i--) {
            p3rev = p3rev + p3String.charAt(i);
        }
        System.out.println("REVERSED STRING: " + p3rev);


        //WORD COUNT IN A SENTENCE
        String p4String = "Here is my Sample Text";
        int words = 0;
        boolean insideWord = false;
        for (int i = 0; i < p4String.length(); i++) {
            char c = p4String.charAt(i);
            if (c != ' ' && !insideWord) {
                insideWord = true;
                words++;
            } else if (c == ' ') {
                insideWord = false;
            }
        }
        System.out.println("WORDS IN THE SENTENCE : " + words);



        //COMPARE TWO STRINGS WITHOUT USING EQUALS
        String p5s1 = "makka";
        String p5s2 = "makk";
        boolean p5result = true;
        if (p5s1.length() != p5s2.length()) {
            p5result=false;
            System.out.println(p5result);
        }
        else if (p5s1.length()==p5s2.length()){
            for (int i = 0, j = 0; i < p5s1.length(); i++, j++) {
                if (p5s1.charAt(i) != p5s2.charAt(i)) {
                    p5result = false;
                    break;
                }
            }
            System.out.println(p5result);
        }

        //REPLACE ALL SPACES WITH '-'
        String p6String="This is my Window Seat";
        p6String=p6String.replaceAll(" ","-");
        System.out.println(p6String);


        //FIND DUPLICATE CHARACTERS
        String p7String="abccdeefffcc";
        String p7noDup="";
          String p7dup="";
        for (int i = 0; i < p7String.length(); i++) {
            char c = p7String.charAt(i);
            boolean duplicate = false;
            for (int j = 0; j < p7noDup.length(); j++) {
                if (c == p7noDup.charAt(j)) {
                    p7dup+=c;
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                p7noDup += c;
            }
        }
        System.out.println(p7noDup);
        System.out.println(p7dup);



        //REMOVE VOWELS FROM A STRING
        String p8String="This is Quantum Mechanics";
        p8String=p8String.toLowerCase();
        String p8Res ="";
        for (int i = 0; i < p8String.length(); i++) {
            char c=p8String.charAt(i);
            boolean duplicate=false;
            if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u' ){
                duplicate=true;
            }
            if(!duplicate){
                p8Res +=c;
            }
        }
        System.out.println("SENTENCE WITHOUT VOWELS : "+p8Res);


        //REMOVE ALL DUPLICATES
        String p9String="abccdeefffcc";
        String p9noDup="";
        for (int i = 0; i < p9String.length(); i++) {
            char c = p9String.charAt(i);
            boolean duplicate = false;
            for (int j = 0; j < p9noDup.length(); j++) {
                if (c == p9noDup.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                p9noDup += c;
            }
        }
        System.out.println(p9noDup);


        //SWAP TWO STRING
        String p10s1="QWERTY";
        String p10s2="WALKER";
        String temp=p10s1;
        p10s1=p10s2;
        p10s2=temp;
        System.out.println(p10s1);
        System.out.println(p10s2);

        //SWAP TWO VARIABLE WITHOUT THIRD VARIABLE
        String p11s1="SQUARE";
        String p11s2 ="TIMES";
        p11s1=p11s1+ p11s2;
        p11s2 =p11s1.substring(0, p11s1.length()-p11s2.length());
        p11s1=p11s1.substring(p11s2.length());
        System.out.println(p11s1);
        System.out.println(p11s2);

    }
}
