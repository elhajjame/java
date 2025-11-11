public class School {
    String schoolName;
    Teacher [] teachers;

    School (String schoolName,Teacher [] teachers){
        this.schoolName = schoolName;
        this.teachers = teachers;
    }

    void displaySchool(){
        System.out.println("schools: " + schoolName);
        System.out.println("teachers: ");
        for (int i = 0; i < teachers.length; i++){
            teachers[i].displayTeacher();
        }
    }
}
