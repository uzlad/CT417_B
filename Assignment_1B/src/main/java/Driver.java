import CT417_1.lecturer;
import CT417_1.module;
import CT417_1.programme;
import CT417_1.student;
import org.joda.time.DateTime;

public class Driver {

    public Driver(){

    }

    public static void main(String[] args) {
        student s1 = new student("Usman Arif", 21, "25/08/2001", 19308281);
        student s2 = new student("Bilbo Baggins", 129, "22/09/1893", 1);
        student s3 = new student("Bruce Wayne", 26, "12/12/1996", 2);
        student s4 = new student("Neymar JR.", 30, "05/02/1992", 10);

        lecturer l1 = new lecturer("Bill Nye", 25, "20/02/1997", 4);
        lecturer l2 = new lecturer("Rob Bor", 26, "20/02/1996", 5);
        lecturer l3 = new lecturer("Sam Sung", 27, "20/02/1995", 6);
        lecturer l4 = new lecturer("Nicholas Flamel", 27, "12/04/1202", 7);

        module m1 = new module("Linguistics", "CT11", l1);
        module m2 = new module("Mathematics", "CT11", l1);
        module m3 = new module("Athletics", "CT11", l2);
        module m4 = new module("Physics", "CT11", l3);
        module m5 = new module("Advanced Physics", "CT11", l3);
        module m6 = new module("Alchemy", "CT11", l4);


        programme p1 = new programme("BSc. Wizardry", new DateTime(2022,6,12,0,0), new DateTime(2026,6,12,0,0));
        programme p2 = new programme("BSc. Physics", new DateTime(2022,6,12,0,0), new DateTime(2026,6,12,0,0));
        programme p3 = new programme("BSc. Mathematics", new DateTime(2022,6,12,0,0), new DateTime(2026,6,12,0,0));

        p1.addModules(m6);
        p1.addModules(m3);
        p2.addModules(m4);
        p2.addModules(m5);
        p3.addModules(m2);
        p3.addModules(m1);

        s1.addModules(m1);
        s1.addModules(m2);
        s2.addModules(m3);
        s2.addModules(m4);
        s3.addModules(m5);
        s4.addModules(m6);

        s1.addCourseProgramme(p3);
        s2.addCourseProgramme(p1);
        s3.addCourseProgramme(p2);
        s4.addCourseProgramme(p2);

        m1.addCourses(p3);
        m2.addCourses(p3);
        m3.addCourses(p1);
        m4.addCourses(p2);
        m5.addCourses(p2);
        m6.addCourses(p1);

        m1.addStudents(s1);
        m2.addStudents(s1);
        m3.addStudents(s2);
        m4.addStudents(s2);
        m5.addStudents(s3);
        m6.addStudents(s4);

        // print all courses -> modules
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


        // print all students -> usernames -> modules assigned -> courses registered to
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}
