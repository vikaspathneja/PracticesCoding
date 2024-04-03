package misc;// CODE EXAMPLE VALID FOR COMPILING

import java.util.*;

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    private List<Subject>subjects=new ArrayList<>();

    public int getTotalMarks() {
        return totalMarks;
    }

    private int totalMarks;

    public Student(String name){
        this.name=name;
    }

    void addSubject(Subject sub){
        this.subjects.add(sub);
    }
    public void settotalMarks(int marks){
        this.totalMarks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
class Subject{
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Subject(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class StudentWithSortingByTotalSubjects {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Student>students=new ArrayList<>();

        Subject student1english=new Subject("English",35);
        Subject student1math=new Subject("Math",40);
        Student alok=new Student("alok");
        alok.addSubject(student1english);
        alok.addSubject(student1math);

        Subject student2math=new Subject("Math",30);
        Subject student2english=new Subject("English",20);
        Student samik=new Student("samik");
        samik.addSubject(student2math);
        samik.addSubject(student2english);


        Subject student3math=new Subject("Math",30);
        Subject student3english=new Subject("English",20);
        Student jyoti=new Student("Jyoti");
        jyoti.addSubject(student3math);
        jyoti.addSubject(student3english);

        students.add(alok);
        students.add(samik);
        students.add(jyoti);

        students.stream().map(stu->{
                    int totalMarks=stu.getSubjects().stream().mapToInt(Subject::getMarks).sum();
                    stu.setTotalMarks(totalMarks);
                    return stu;
                })
                .sorted(Comparator.comparingInt(Student::getTotalMarks).reversed()).forEach(System.out::println);







    }
}