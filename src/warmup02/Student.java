
package warmup02;
// 1. add a variable to keep track of the number of created student
// 2. revise the class for assigning a unique id for new student 
class Student {
    private long id;
    private String name;
    private int count;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return "Id:" + id + "\t" + name;
    }    
    
    
}
