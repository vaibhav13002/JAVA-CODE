package StringRecursion;

public class RemoveCharact {
    public static void main(String[] args) {
        // skip("", "baacDaF");
        System.out.println(skipApple("vaiapplebhav"));
        System.out.println(skipAppNotApple("aapbbbappleapp"));
    }
static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        if(ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }
    
//if you want to skip a word or a grp of letter together eg "apple"
static String skipApple(String up1){
        if(up1.isEmpty()){
            return "";
        }
        
        if(up1.startsWith("apple")){
           return skipApple(up1.substring(5));
        }
        else{
            return up1.charAt(0) + skipApple(up1.substring(1));
        }//ek character ko leke nest ke liye recursion call ho rha h   char + String            
    }

static String skipAppNotApple(String up2){
        if(up2.isEmpty()){
            return "";   //base condition
        }
        
        if(up2.startsWith("app") && !up2.startsWith("apple")){
           return skipAppNotApple(up2.substring(3));
        }
        else{
            return up2.charAt(0) + skipAppNotApple(up2.substring(1));
        }//a app ko skip krega only if it is not apple
            
    }
}

