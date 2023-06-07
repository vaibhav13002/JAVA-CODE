class Students{
    int rollno;
    String name;
    int marks;
}

public class Array3 {
    public static void main(String[] args) {

        Students s1=new Students();
        s1.rollno=20;
        s1.name="vaibhav";
        s1.marks=85;

        Students s2=new Students();
        s2.rollno=21;
        s2.name="Kai";
        s2.marks=58;

        Students s3=new Students();
        s3.rollno=28;
        s3.name="Ray";
        s3.marks=98;

        Students students[]=new Students[3];    //idhr ek students[] naam ka array bana rhe h 
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // System.out.println(s1.name+":" +s1.rollno+":"+ s1.marks);
        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name+":"+students[i].rollno+":"+students[i].marks);
        // }

        for(Students n:students){
            System.out.println(n.name+":"+n.marks);
        }
    
    }   
}
