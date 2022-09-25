package java_basics.group_exercises;

public class GetDaysInMonth {

    public static void main(String[] args) {
        int month = 12;
        int year = 10000;

        GetDaysInMonth obj = new GetDaysInMonth();
        System.out.println(obj.getDaysInMonth(month, year)); // 30
    }

    public int getDaysInMonth(int month, int year) {
        int numOfDays = -1;

        if (month < 1 || month > 12) {
            return numOfDays;
        } else if (year < 1 || year > 9999) {
            return numOfDays;
        }

        // What must be true if the method execution gets to this line? Valid year + valid month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
        }
        return numOfDays;
    }

    private boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            isLeapYear = true;
        }

        return isLeapYear;
    }
}
