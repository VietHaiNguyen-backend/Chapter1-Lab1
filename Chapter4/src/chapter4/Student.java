package chapter4;

// class: la viec mo hinh hoa 1 doi tuong ngoai doi song vao ben trong chuong trinh,
// nhung chi mieu ta o tap lop tong quat chua dinh nghia cu the cho no 
public class Student {
    // 1 Class Attributes: thuoc tinh mieu ta class
    // khong quy dinh bao nhieu thuoc tinh hoac khong co thuoc tinh nao cung duoc
    // dinh nghia cac thuoc tinh
    String name;
    int age;

    public Student() {

    }

    // constructor: ham tao
    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // 2 class method
    // dinh nghia cac hanh vi
    void learnJave() {
        System.out.println("Leran Java with Youtube");
    }

    void learnJave(int a) {
        System.out.println("Leran Java with Youtube");
    }

    String getAge() {
        return "Hello";
    }
}