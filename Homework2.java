import java.util.Scanner;

class Student {
    int id;
    String name;
    String major;
    String phone;

    public Student(int id, String name, String major, String phone) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() { return major; }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // 전화번호 010-xxxx-xxxx 형식
    public String getPhoneNumber() {
        if (phone!= null && phone.length() == 11) {
            return phone.substring(0, 3) + "-" +
                    phone.substring(3, 7) + "-" +
                    phone.substring(7);
        }
        return phone;
    }


    // 학생 정보 출력
    public String toString() {
        return id + " " + name + " " + major + " " + getPhoneNumber();
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            String phone = sc.next();

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번째 학생: " + students[i]);
        }
    }
}