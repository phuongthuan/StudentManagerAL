package StudentManager.StudentMn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PhuongThuan on 7/11/2016.
 */
public class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public StudentManager(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentManager(){

    }

    //Add Student:==========================================================
    public boolean addStudent(Student element){
        if(!isDuplicateName(element.getName()) && !isDuplicateID(element.getId())){
            studentList.add(element);
            return true;
        }
        return false;
    }


    //Edit Student:==========================================================
    public boolean editStudent(String oldid, String newid, String newname, String newage, String newaddress){
        if(isDuplicateID(oldid)){
            for (int i = 0; i < studentList.size(); i++) {
                if(studentList.get(i).getId().equals(oldid)){
                    studentList.get(i).setId(newid);
                    studentList.get(i).setName(newname);
                    studentList.get(i).setAge(newage);
                    studentList.get(i).setAddress(newaddress);
                    return true;
                }
            }
        }
        return false;
    }

    //Delete Student:========================================================
    public boolean deleteStudent(String id){
        if(isDuplicateID(id)){
            for (int i = 0; i < studentList.size(); i++) {
                if(studentList.get(i).getId().equals(id)){
                    studentList.remove(i);

                }
            }
        }
        return false;
    }

    //Search Student:
    public Student findStudentById(String id){
        if(isDuplicateID(id)){
            for (int i = 0; i < studentList.size(); i++) {
                if(studentList.get(i).getId().equals(id));
                return studentList.get(i);
            }
        }
        return null;
    }

    public Student findStudentByName(String name){
        if(isDuplicateName(name)){
            for (int i = 0;i < studentList.size(); i++) {
                if(studentList.get(i).getName().equals(name)){
                    return studentList.get(i);
                }
            }
        }
        return null;
    }
    //Check isDuplicateID, isDuplicateName:************************************

    public boolean isDuplicateID(String inputID){
        if(studentList.size() == 0){
            return false;
        }else {
            for (int i = 0; i <studentList.size() ; i++) {
                if(studentList.get(i).getId().equals(inputID)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDuplicateName(String inputName){
        if(studentList.size() ==0){
            return false;
        }else {
            for (int i = 0; i < studentList.size(); i++) {
                if(studentList.get(i).getName().equals(inputName)){
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){

        String st = " ";
        for (int i=0; i < studentList.size(); i++) {
            studentList.get(i).getId();
            studentList.get(i).getName();
            studentList.get(i).getAge();
            studentList.get(i).getAddress();
            st += "ID: " + studentList.get(i).getId()  + "\n" +
                  "Name: "  + studentList.get(i).getName() + "\n" +
                    "Age: " + studentList.get(i).getAge() + "\n" +
                    "Address: " + studentList.get(i).getAddress() + "\n" +
            "------------------" + "\n";
        }
        return st;
    }

}
