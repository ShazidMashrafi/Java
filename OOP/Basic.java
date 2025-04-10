class Teacher
    {
        String name,gender;
        int age;
    }

public class Basic
{
    
    public static void main(String[] args)
    {
        Teacher teacher0;  //Object declare
        teacher0 = new Teacher(); //Object creation
        Teacher teacher1 = new Teacher();

        teacher1.name =  "Shazid";
        teacher1.gender = "male";
        teacher1.age = 22;

        System.out.println("Name : "+teacher1.name);
        System.out.println("Age : "+teacher1.age);
        System.out.println("Gender : "+teacher1.gender);
        
        
        Teacher teacher2 = new Teacher();

        teacher2.name =  "Mashrafi";
        teacher2.gender = "male";
        teacher2.age = 20;

        System.out.println("Name : "+teacher2.name);
        System.out.println("Age : "+teacher2.age);
        System.out.println("Gender : "+teacher2.gender);

    }
}