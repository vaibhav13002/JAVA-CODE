public class JaggedArray {
    public static void main(String[] args) {
        int arry[][]=new int[3][4];

        arry[0]=new int[3];
        arry[1]=new int[2];
        arry[2]=new int[4];

        for(int i=0;i<arry.length;i++){
            for(int j=0;j<arry[i].length;j++){
                arry[i][j]=(int)(Math.random()*10);
            }
        }
        for(int k[]:arry){
            for(int l:k){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
