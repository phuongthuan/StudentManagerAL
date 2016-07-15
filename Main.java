package StudentManager.StudentMn;

import java.util.Scanner;

/**
 * Created by PhuongThuan on 7/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        boolean set = true;
        StudentManager manager = new StudentManager();
        Scanner input = new Scanner(System.in);
        while (set){
            System.out.println("**********************");
            System.out.println("* STUDENT MANAGER    *");
            System.out.println("* 1.ADD STUDENT      *");
            System.out.println("* 2.EDIT STUDENT     *");
            System.out.println("* 3.DELETE STUDENT   *");
            System.out.println("* 4.SEARCH STUDENT   *");
            System.out.println("* 5.DISPLAY STUDENT  *");
            System.out.println("* 0.QUIT             *");
            System.out.println("**********************");
            System.out.println("ENTER YOUR CHOICE: ");

            int choice = input.nextInt();
            switch (choice){
                case 1:
                    input.nextLine();
                    System.out.println("ADD STUDENT");
                    System.out.println("ENTER ID - NAME - AGE - ADDRESS: ");
                    Student entry = new Student(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine());
                    if(manager.addStudent(entry)){
                        System.out.println("add success !!");
                    }else{
                        System.out.println("dkm=))");
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Edit Student");
                    System.out.println("EnterID: ");
                    String oldid = input.nextLine();
                    System.out.println("Enter newID: ");
                    String newid = input.nextLine();
                    System.out.println("Enter newName: ");
                    String newname = input.nextLine();
                    System.out.println("Enter newAge: ");
                    String newage = input.nextLine();
                    System.out.println("Enter newAddress: ");
                    String newaddress = input.nextLine();
                    if(manager.editStudent(oldid, newid, newname, newage, newaddress)){
                        System.out.println("Edit success!!");
                    }else {
                        System.out.println("dkm=))");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("DELETE STUDENT");
                    System.out.println("EnterID yourID: ");
                    String yourID = input.nextLine();
                    if(manager.deleteStudent(yourID)){
                        System.out.println("Delete success!!");
                    }else {
                        System.out.println("dkm=))");
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("SEARCH STUDENT");
                    System.out.println("1.Search Student by ID");
                    System.out.println("2.Search Student by Name");
                    int choicecase4 = input.nextInt();
                    switch (choicecase4){
                        case 1:
                            input.nextLine();
                            System.out.println("Search Student by ID");
                            System.out.println("Enter yourID: ");
                            String findID = input.nextLine();
                            Student rs1 = manager.findStudentById(findID);
                            if(rs1 != null){
                                System.out.println(rs1.toString());
                            }else {
                                System.out.println("No money No love =))");
                            }
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("Search Student by Name");
                            System.out.println("Enter yourName: ");
                            String findID1 = input.nextLine();
                            Student rs2 = manager.findStudentByName(findID1);
                            if(rs2 != null){
                                System.out.println(rs2.toString());
                            }else {
                                System.out.println("No money No love =))");
                            }
                            break;
                        default:
                            System.out.println("dkm=))");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("NumberOfStudent: " + manager.getStudentList().size() + " Student");
                    System.out.println(manager.toString());
                    break;
                case 0:
                    System.out.println("GGWP");
                    set = false;
                    break;
                default:
                    System.out.println("dkm=))");
                    break;
            }
        }
    }
}
