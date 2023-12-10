
  
class first {
    public static void main (String[] args) {
        
        String str= "Geeks", p="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        p= ch+p; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ p);

      StringBuilder cc = new StringBuilder();
      for(int i= str.length()-1; i>=0; i--){
        char s= str.charAt(i);
        cc.append(s);
      }
      System.out.println("Jai shre ram : "+cc );
    }
}


