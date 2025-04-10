class Teacher
    {
        String name,gender;
        int age;
        void info(String nm, int ag, String gen)
        {
            name = nm;
            age = ag;
            gender = gen;
        }
        void display()
        {
            System.out.println("Name : "+ name);
            System.out.println("Age : "+ age);
            System.out.println("Gender : "+ gender);
            System.out.println("");
        }
    }

public class Method2
{
    
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher();
        teacher1.info("Shazid",22,"male");
        teacher1.display();
        
        
        Teacher teacher2 = new Teacher();
        teacher2.info("Mashrafi",20,"male");
        teacher2.display();

    }
}