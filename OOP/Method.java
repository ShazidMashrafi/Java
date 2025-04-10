class Teacher
    {
        String name,gender;
        int age;

        void display()
        {
            System.out.println("Name : "+ name);
            System.out.println("Age : "+ age);
            System.out.println("Gender : "+ gender);
            System.out.println("");
        }
    }

public class Method
{
    
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher();
        teacher1.name =  "Shazid";
        teacher1.gender = "male";
        teacher1.age = 22;
        teacher1.display();
        
        
        Teacher teacher2 = new Teacher();
        teacher2.name =  "Mashrafi";
        teacher2.gender = "male";
        teacher2.age = 20;
        teacher2.display();

    }
}