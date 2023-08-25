public class AtoZ {
    public static void main(String[] args) {
        String series="";
        for(int i=0; i<26 ; i++){
            char a=(char)('a'+i);
            // System.out.print((a+" ").toUpperCase());
            series +=a+" ";
        }
        System.out.println(series.toUpperCase());
        // String a="Vaibhav";
        // System.out.println(a.toUpperCase());
 
    }
}

//in this solution so much memory wastimg is there as every time it is store new term by adding in new place
