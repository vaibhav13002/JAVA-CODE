
class Mars{
    int Rollno;
    String Sname;
    String Student(int Rollno,String Sname){
        this.roll_no = roll_no;
        this.name = name;
    }
    
}   
public class Array2 {
    public static void main(String[] args) {
        Mars obj=new Mars();
        Student[] arr;  
        arr = new Student[4];
        arr[0]=new Student(1,"Vaibhav");
        arr[1]=new Student(2,"Max"); 
        arr[2]=new Student(3,"Sam"); 
        arr[3]=new Student(4,"Kai");  
        
        for(int i=0;i<arr.length;i++){
            System.out.println(obj.Student[i]);
        }
    }
}
