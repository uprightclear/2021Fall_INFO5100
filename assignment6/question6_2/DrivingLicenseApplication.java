package question6_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    Date dateOfBirth;

    public DrivingLicenseApplication() throws ParseException {
        System.out.println("Please input your date of birth in format \"yyyy-MM-dd\"");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            this.dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.next());
        }

        Calendar now = Calendar.getInstance();
        Calendar born = Calendar.getInstance();
        now.setTime(new Date());
        born.setTime(dateOfBirth);

        if(born.after(now)){
            throw new IllegalArgumentException("Can't be born in the future");
        }

        int age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
        if(now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR)) {
            age -= 1;
        }

        try {
            apply(age);
            System.out.println("Application completed");
        } catch (ageException e) {
            System.out.println("The age of the applicant is " + e.getAge() + " which is too early to apply for a driving license");
            e.printStackTrace();
        }
    }

    public static class ageException extends Exception {
        private int age;
        public ageException(int age) {
            this.age = age;
        }
        public int getAge() {
            return this.age;
        }
    }

    public static void apply(int age) throws ageException{
        if(age < 16) throw new ageException(age);
    }
}
