// Task 2- STUDENT GRADE CALCULATOR
import java.util.*; 
class student
    {
        float marks=0,per=0,sub;
        String roll,grade;
        Scanner sc=new Scanner(System.in);
        void get()
        {
            
            System.out.print("\n Enter your roll no= ");
            roll=sc.next();

            for(int i=1;i<=6;i++)
            {
                System.out.print("\n Enter "+i+" subject marks[out of 100]= ");
                sub=sc.nextFloat();
                if(sub<0 || sub>100)
                {
                    System.out.print("\n Invalid input! Marks should be between 0 and 100 please reenter");
                    i--;
                }
                else
                {
                    marks=marks+sub;
                }
                
            }
            
            per=(marks/600)*100;
            if(per>90)
            {
                grade="A+";
            }
            else if(per>80)
            {
                grade="A";
            }
            else if(per>70)
            {
                grade="B+";
            }
            else if(per>60)
            {
                grade="B";
            }
            else if(per>50)
            {
                grade="C+";
            }
            else if(per>40)
            {
                grade="C";
            }
            else
            {
                grade="Fail";
            }

        }
       
        void show()
        {
            System.out.print("\n ******* Result *******");
            System.out.print("\n Roll number = "+roll);
            System.out.print("\n Total marks = "+marks+" Out of 600");
            System.out.print("\n Average percentage = "+per+"%");
            System.out.print("\n Grade = "+grade);

        }
    }

class Task02_grade
{
    public static void main(String[] args)
    {
        student s1=new student();
        s1.get();
        s1.show();
    }
}