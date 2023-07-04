package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0 && month > 0 && month < 13) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        if (month == 2) {
                            System.out.println(29);
                            return;
                        }
                        if (month == 6) {
                            System.out.println(30);
                            return;
                        }
                    }
                } else {
                    if (month == 2) {
                        System.out.println(29);
                        return;
                    }
                    if (month == 6) {
                        System.out.println(30);
                        return;
                    }
                }
            }
            if (month == 2) {
                System.out.println(28);
            }
            if (month == 6) {
                System.out.println(30);
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
