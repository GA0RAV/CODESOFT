// Task 1 - NUMBER GAME
import java.util.Random;
import java.util.*;
class Task01_random_num_game
{
    public static void main(String[] args)
    {
        Random ran=new Random();
        int score=0;
        int i=0,round=0;
        int f=0;
        boolean b;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nGuess the num in range between 1 To 100 \n******* Lets Begin *******");
        do
        {

        round++;
        int no=ran.nextInt(100-1+1)+1;
        System.out.print("\n Round "+round);
        System.out.print("\n Total Attemp 3...");

        for(i=0;i<3;i++)
        {
            
            System.out.print("\n "+(i+1)+" Attempt enter the number =");
            int n=sc.nextInt();
            if(n==no)
            {

               System.out.print("\n Hurrey ! You Won Right Guess");
                
                score=100-(i*25);
                break;
                
            }
            else
            {
                if(i==2)
                {
                    System.out.print("\n  You Loose ! .... The number was "+no);

                }

                else if(n>(no))
                {
                    System.out.print("\n  Too High Wrong Guess ! ");
        
                }

                else
                {
                    System.out.print("\n Too Low Wrong Guess ! ");
                }
                
            }

        }

        f=f+score;
        System.out.print("\n Do you want play again [ Press 1 for Yes | 2 for No ] = ");
        int ch=sc.nextInt();
        if(ch==1)
        {
            b=true;
        }
        else
        {
            b=false;
        }
        }while(b);
    System.out.print("\n Total Round = "+round+"  \n Your Score =["+f+"/"+(100*round)+"] \n Thank you........");
    }
}
