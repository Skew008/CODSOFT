package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CourseDB cb = new CourseDB();
        StudentDB sb = new StudentDB();
        Scanner sc = new Scanner(System.in);
        Course c;
        for(Student s:sb.students)
        {
            System.out.println("Student ID: "+s.stid+"   Student: "+s.name);
            System.out.println("Welcome to our Course Registration Program!!!");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("List of Courses:");
            cb.listCourses();
            int k=0;
            while(k!=1)
            {
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println("1 to register for courses.\n2 to check for taken courses.\n3 to delete a taken course.\nAny other to exit system.");
                System.out.print("Enter your choice:");
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.print("Enter course title:");
                        c = setCourse(cb,sc.next());
                        sb.register(c, s.stid);
                        System.out.println("Successfully Registered for "+c.title+"!!!\n");
                        break;
                    case 2:
                        System.out.println("List of Courses Taken:");
                        sb.taken(s.stid);
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.print("Enter course title:");
                        c = setCourse(cb,sc.next());
                        sb.delete(c, s.stid);
                        System.out.println("Registration deleted for "+c.title+"\n");
                        break;
                    default:
                        k=1;
                        System.out.println("\n\n");
                        break;
                }
            }
        }
        sc.close();
    }

    private static Course setCourse(CourseDB cb, String s)
    {
        for(Course c:cb.courses)
        {
            if(c.title.equals(s))
            {
                return c;
            }
        }
        return null;
    }
}
