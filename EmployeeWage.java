public class EmployeeWage{
    public static void main(String[] args) {
        System.out.println("welcome to employee wage problem");

        final int PRESENT = 1;
        int var = (int) (Math.random() * 10) % 2;
        if (var == PRESENT)
            System.out.println(" Employee is Present");
        else
            System.out.println(" Employee is Absent");
        
    }
    }