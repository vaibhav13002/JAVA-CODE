public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int n=a.length;
        int m=b.length;
        System.out.println(medianOfArrays(n, m, a, b));
    }
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int size = n+m;
        int[] c = new int[size];
        // int x = Math.max(n, m);
        int mid = size/2;
        int i = 0;  //to trace a
        int j = 0;  //to trace b
        int k = 0;  //to trace c
        while(i<n || j<m){  // it checks is there any number in n and m
            // if(a[i]<=b[j]) {
            if(i < n && (j >= m || a[i] <= b[j])){  //if(a[i]<=b[j]) for this we need to make whilee contn && and need to check if any 1 element is there in any of array
                c[k]=a[i];//element n me (a) me bacha h j me nhi h ya h tho bada h...so a ke element ko c me dalengey vrna else condn jo ki reverse h iska
                i++;
            }else{   // c jo ki new arr h usme ascending order me value fill hoga
                c[k]=b[j];
                j++;
            }
            k++;
        }
        // while(i<n){
        //     c[k]=a[i];
        //     i++;
        //     k++;
        // }
        // while(j<m){
        //     c[k]=b[j];
        //     j++;
        //     k++;
        // }
        return (size%2==0) ? (double)(c[mid]+c[mid-1])/2 : c[mid]; // a check krega ki agr expression 
        // even h tho both mid no. ka avg calc hoga varna odd rha tho sidha mid value return kro vhi median h

}
}
