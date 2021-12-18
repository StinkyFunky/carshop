import student.ErpSystem;
import student.Student;
import student.Teacher;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        FerrariEngine ferrari1 = new FerrariEngine(6.0, 8, 600);
//        FerrariEngine ferrari2 = new FerrariEngine(5.0, 4, 500);
//        FerrariEngine ferrari3 = new FerrariEngine(4.5, 6, 400);
//
//        RenaultEngine renault1 = new RenaultEngine(2.3, 4, 450, 200);
//        RenaultEngine renault2 = new RenaultEngine(3.3, 8, 450, 100);
//        RenaultEngine renault3 = new RenaultEngine(2.8, 6, 350, 210);
//
//        List<Engine> engineList = new ArrayList<>();
//
//        engineList.add(ferrari1);
//        engineList.add(ferrari2);
//        engineList.add(ferrari3);
//
//        engineList.add(renault1);
//        engineList.add(renault2);
//        engineList.add(renault3);
//
//        for (Engine e: engineList) {
//            System.out.println(e.getMaxSpeed());
//

        Student student1 = new Student(1, "montana", "qwerty", "Tony", "Montana", "Finance", 5.0);
        Student student2 = new Student(2, "stark", "qwerty1", "Tony", "Stark", "IBM", 4.0);

        Teacher teacher1 = new Teacher(3, "qwe", "qwe", "kfndfk", "on", Collections.singletonList("Qwescsaf"), 1);
        Teacher teacher2 = new Teacher(4, "qwe", "qwert", "zxvv", "off", Collections.singletonList("exort"), 2);


        ErpSystem system = new ErpSystem();

        system.addUser(student1);
        system.addUser(student2);
        system.addUser(teacher1);
        system.addUser(teacher2);

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("PRESS [1] TO ADD USER\nPRESS [2] TO LIST USERS\n" +
                    "PRESS [3] TO LIST USER BY INDEX\nPRESS [0] TO EXIT");
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    System.out.println("PRESS [1] TO ADD STUDENT\nPRESS [2] TO ADD TEACHER");
                    if (value == 1) {

                        System.out.println("Enter id: ");
                        int id = scanner.nextInt();
                        System.out.println("Enter login: ");
                        String login = scanner.next();
                        System.out.println("Enter password: ");
                        String password = scanner.next();
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter surname: ");
                        String surname = scanner.next();
                        System.out.println("Enter group: ");
                        String group = scanner.next();
                        System.out.println("Entre gpa: ");
                        double gpa = scanner.nextDouble();

                        Student student = new Student();
                        student.setId(id);
                        student.setLogin(login);
                        student.setPassword(password);
                        student.setName(name);
                        student.setSurname(surname);
                        student.setPassword(password);
                        student.setGroup(group);
                        student.setGpa(gpa);
                        system.addUser(student);
                        break;
                    } else if (value == 2) {

                        System.out.println("Enter id: ");
                        int id = scanner.nextInt();
                        System.out.println("Enter login: ");
                        String login = scanner.next();
                        System.out.println("Enter password: ");
                        String password = scanner.next();
                        System.out.println("Enter nickname: ");
                        String nickName = scanner.next();
                        System.out.println("Enter status: ");
                        String status = scanner.next();
                        System.out.println("Enter subject: ");
                        String subject = scanner.next();
                        System.out.println("Entre size of subjects: ");
                        int sizeOfSubjects = scanner.nextInt();

                        Teacher teacher = new Teacher();
                        teacher.setId(id);
                        teacher.setLogin(login);
                        teacher.setPassword(password);
                        teacher.setNickName(nickName);
                        teacher.setStatus(status);
                        teacher.setSubjects(Collections.singletonList(subject));
                        teacher.setSizeOfSubjects(sizeOfSubjects);
                        system.addUser(teacher);
                        break;
                    } else {
                        System.out.println("Something wrong!");
                    }
                    break;
                case 2:
                    System.out.println("PRESS [1] TO LIST STUDENTS\nPRESS [2] TO LIST TEACHERS");
                    if (value == 1) {
                        system.printAllUsers();
                    } else if (value == 2) {
                        system.printAllUsers();
                    } else {
                        System.out.println("Something wrong!");
                    }
                    break;
                case 3:
                    System.out.println("ENTER INDEX: ");
                    int index = scanner.nextInt();
                    system.printUser(index);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Something wrong!");
            }
        }
    }
}
