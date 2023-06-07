import java.util.StringJoiner;

import javax.print.DocFlavor.STRING;
import javax.swing.SpringLayout;
import javax.xml.transform.Source;

public class cwh_14_strings {public static void main(String[] args) {
    String name="Vaibhav";
    int value=name.length();
    // System.out.println(value);

    // String lstring=name.toLowerCase();
    // System.out.println(lstring);

    // String a="           Vaib"   +  "hav    ";
    // System.out.println(a.trim());
    // System.out.println("begin + End : " + name.substring(1,6));
    // System.out.println(name.substring(2));
    // System.out.println(name.replace('v', 'a'));
    // System.out.println(name.repeat(8));
    // System.out.println(name.replace("v", "vai"));     // char to string
    // System.out.println(name.replace("bhav", "a"));

    // System.out.println(name.startsWith("V"));

    // System.out.println(name.charAt(4));
    // System.out.println(name.indexOf("i"));
    // System.out.println(name.indexOf("av", 3));

    String b="vaibhavmishrava";
    // System.out.println(b.lastIndexOf("av", 8));

    // System.out.println(b.lastIndexOf("av"));
    // System.out.println(b.length());

    // System.out.println(name.equals("Vaibhav"));

    // System.out.println("Jai Shree \f Ram");
//lect +practise
    // System.out.println(name.length());
    // System.out.println(name.toLowerCase());
    // System.out.println(name.toUpperCase());
    // System.out.println(name.trim());
    // System.out.println(name.substring(2));
    // System.out.println(b.substring(1,5));
    // System.out.println(name.replace('v', 'a'));
    // System.out.println(name.replace("av", "aaaaa"));
    // System.out.println(name.replaceFirst("V", "aaaa"));
    // System.out.println(name.startsWith("V"));
    // System.out.println(name.endsWith("a"));
    // System.out.println(name.charAt(3));
    // System.out.println(name.indexOf("b"));
    // System.out.println(name.indexOf("ibh",1));       //String b="vaibhavmishrava";
    // System.out.println(b.lastIndexOf("av"));
    // System.out.println(b.lastIndexOf("av", 8));      //it starts search from the index value 1 but gives output refrence index value from 0
    // System.out.println(name.equals("Vaibhav"));
    // System.out.println(name.equalsIgnoreCase("vaibHav"));
 //practise set  
    // String c="  bega     ";
    // System.out.println(c.replace(" ", "_"));
    // String d="Dear <|name|>, Thanks alot";
    // System.out.println("Dear <|name|>, Thanks alot");
    // System.out.println(d.replace("<|name|>", "Vaibhav"));

    // System.out.println(c.startsWith("  "));
//w3school refrence string
    // System.out.println(name.codePointAt(0));
    // System.out.println(name.codePointBefore(1));
    // System.out.println(name.codePointCount(0, 4));
    // System.out.println(name.compareTo("b"));
    // System.out.println(name.concat("bggh"));
    // System.out.println(name.contains("Vaibh"));      // checks string
    // System.out.println(name.contentEquals("Vaibhav"));    //checks full string in s sentance
    // System.out.println(name.hashCode());
    // System.out.println(name.intern());
    // System.out.println(name.isBlank());
    // System.out.println(name.matches("vaibhav"));
    // System.out.println(name.offsetByCodePoints(0, 3));
    // System.out.println(b.replaceAll("vai", "zzzz"));
    // System.out.println(name.split(" "));
    // System.out.println(name.toCharArray());
    // System.out.println(name.valueOf("5"));

    String a1="vai";
    String a2="bhav";
    System.out.println("vai".concat("bhav"));
    // System.out.println(a1 +" "+a2);




}
    
}
