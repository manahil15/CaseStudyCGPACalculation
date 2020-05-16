/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpacalculation;
import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author Manahil Khalid
 */
public class CGPACalculation{
    Scanner input=new Scanner(System.in);
    public String name;
    public String regNo;
    public String cources;
    
    //Students Add
    
    public void AddStudents(){
        int len;
        System.out.println("How many students you want to enter");
        len=input.nextInt();
        CGPACalculation[] arr=new CGPACalculation[len];
        for(int i=0;i<len;i++){
        System.out.println("Enter name of student "+ (i+1));
        name=input.next();
        System.out.println("Enter registration number of student "+ (i+1));
        regNo=input.next();
        System.out.println("Enter cource of student "+ (i+1));
        cources=input.next();
        } 
    }
    
   //CGPA Calculation with three parameter passing
  
     
    public void CGPA(int semester,int creditHours,float gpa){
        double[] arr;
        double sumCrdthrs=0;
        double sumGpa=0;
        double CGPA=0;
        System.out.println("Enter data to find the cgpa");
        System.out.println("***************************");
        System.out.println("Enter total semesters");
        semester=input.nextInt();
        for(int i=0;i<semester;i++)
        {
        int num=i+1;
        System.out.println("Enter semester no " + num + " data");
        System.out.println("");
        System.out.println("Enter Credit Hours");
        creditHours=input.nextInt();
        System.out.println("Enter gpa");
        gpa=input.nextFloat();
        sumCrdthrs=sumCrdthrs+creditHours;
        sumGpa=sumGpa+gpa;
        }
        
        //Sum of Credithours and gpa
        System.out.println("Total Credit hours are : " + sumCrdthrs);
        System.out.println("Total GPA is : " + sumGpa);
        CGPA=sumCrdthrs/sumGpa;
        System.out.println(" ");
        System.out.println("Total CGPA is : " + CGPA);
        
    }
    
    public static void main(String[] args) {
        int sem = 0;
        int crdthrs = 0;
        float gpa = 0;
        CGPACalculation c1=new CGPACalculation();
        c1.AddStudents();
        c1.CGPA(sem, crdthrs, gpa);
    }
    
}
