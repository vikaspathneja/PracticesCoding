package java_8_features.streams;

import java.util.Arrays;
import java.util.List;

class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;
 
    public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public static List<Student> getStudents(){
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);
        return students;
    }
}
 
class Student{

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }

    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;
 
    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

}
 
class Address{
    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                '}';
    }

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
 
    public String getZipcode() {
        return zipcode;
    }
 
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
 
class MobileNumber{
    @Override
    public String toString() {
        return "MobileNumber{" +
                "number='" + number + '\'' +
                '}';
    }

    private String number;
 
    public MobileNumber(String number) {
        this.number = number;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
}