

public class StringBUilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        System.out.println(sb);
        // sb.append("ello");
        // System.out.println(sb);

        // sb.setCharAt(3, 'u');
        // System.out.println(sb);
        
        // sb.insert(3, sb, 0, 3);
        // System.out.println(sb);

        //Reverse the string
        
        for(int i=0; i< sb.length()/2; i++){  //hello// bas half value tk exchange krna h.
            int front=i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);  
        }
        System.out.println(sb);
    }
}
