package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {
        Student[] idName = new Student[3];
        idName[0] = new Student(60130500063l,"Pasukree");
        idName[1] = new Student(60130500063l,"Pasukree");
        idName[2] = new Student(60130500063l,"Pasukree");
        for(int i = 0; i < idName.length;i++){
        System.out.println(i+ " >>> " + idName[i].toString());
        }
        
        for (Student stu : idName ){
            System.out.println("" + stu.toString());
        }
 
    }
}
