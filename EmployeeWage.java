public class EmployeeWage{
    public static void main(String[] args) {
        System.out.println("welcome to employee wage problem");

        final int PRESENT = 1,wage_per_hour=20,full_day_duration=8;
        int var = (int) (Math.random() * 10) % 2;
        if (var == PRESENT){
            System.out.println(" Employee is Present");
            int daily_wage=wage_per_hour*full_day_duration;
            System.out.println(daily_wage);
            }
        else
            System.out.println(" Employee is Absent");

        
    }
    }