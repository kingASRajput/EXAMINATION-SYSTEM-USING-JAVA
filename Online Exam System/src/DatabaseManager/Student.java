/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

/**
 *
 * @author EJ
 */
public class Student {
    private String username, password, first_name, last_name,  email, program;
    private int student_number;
    
    public Student(int student_number, String username, String password, String first_name, String last_name,  String email, String program){
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.student_number = student_number;
        this.email = email;
        this.program = program;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getFirstName(){
        return this.first_name;
    }
    
    public String getLastName(){
        return this.last_name;
    }
    
    public int getStudentNumber(){
        return this.student_number;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getProgram(){
        return this.program;
    }
}
