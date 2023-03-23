public class Student {
    private String name; //top level objects field names are lowercase instance variables
    private int studentId;  //top level objects field names are lowercase
    private int numberOfCredits = 0;          //top level objects field names are lowercase
    private double gpa;  //top level objects field names are lowercase


    // constructor overloading below
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {  //constructor - passing in all 4 properties for a new student
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    public Student(String name, int studentId) {   //constructor - passing in 2 properties and intializing 2 of them
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = 0;
//        this.gpa = 0.0;

     public Student(String name, int studentId) {
            this(name, studentId, 0, 0);
        }

    public Student(String name) {
            this(name, nextStudentId);
            nextStudentId++;
        }

        public String studentInfo() {        //instance method  this keyword is getting access
            return (this.name + " has a GPA of: " + this.gpa);
        }





//    public String getName() {    //encapsulation - data hiding
//        return name;
//    }
//
//    public void setName(String aName) {   //encapsulation - data hiding
//        name = aName;
//    }
    }
}
