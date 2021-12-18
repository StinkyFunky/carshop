package student;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    private String nickName;
    private String status;
    private List<String> subjects = new ArrayList<>();
    private int sizeOfSubjects = 0;

    public Teacher() {
    }

    public Teacher(int id, String login, String password, String nickName, String status,
                   List<String> subjects, int sizeOfSubjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    @Override
    public String getUserData() {
        return "Teacher: " + "nickName: '" + nickName + '\'' + ", status: '" + status + '\'' +
                ", subjects: " + subjects +
                ", sizeOfSubjects: " + sizeOfSubjects + '.';
    }

    public String getNickName() {
        return nickName;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }
}
