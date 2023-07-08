import java.util.*;

class Salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hrs_in_week[]=new int[7];
        int salary =0,total_hr_in_week=0;
        for(int i=0;i<7;i++)
        {
            hrs_in_week[i]=sc.nextInt();
            salary+=hrs_in_week[i]*100;
            if(i==0&&hrs_in_week[i]>0)
            {
                salary+=((hrs_in_week[i]*100)*0.5);
            }
            else if(i==6&&hrs_in_week[i]>0)
            {
                salary+=((hrs_in_week[i]*100)*0.25);
            }
            else
            {
                total_hr_in_week+=hrs_in_week[i];
            }
            if(hrs_in_week[i]>8)
            {
                int extra_hr=hrs_in_week[i]-8;
                salary+=extra_hr*15;
            }
        }
        if(total_hr_in_week>40)
        {
            salary+=((total_hr_in_week-40)*25);
        }
        System.out.println(salary);
    }
}
