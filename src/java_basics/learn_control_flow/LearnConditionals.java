package java_basics.learn_control_flow;

public class LearnConditionals {

    public static void main(String[] args) {
        LearnConditionals obj = new LearnConditionals();
        System.out.println(obj.getMonthName(20)); // August

//        System.out.println(obj.determineLargestNumber(5, 6));     // 6
//        System.out.println(obj.determineLargestNumber(500, 100)); // 500
//        System.out.println(obj.determineLargestNumber(0, 0));     // -1
//        System.out.println(obj.determineLargestNumber(-50, -45)); // -45
//        System.out.println(obj.determineLargestNumber(5, 1, 5));
    }

//    int determineLargestNumber(int a, int b) {
//        if (a < b) {
//            return b;
//        } else if (b < a) {
//            return a;
//        }
//
//        return -1;
//    }
//
//    int determineLargestNumber(int a, int b, int c) {
//        if (a > b) {
//            if (a > c) {
//                return a;
//            }
//            return c;
//        } else if (b > c) {
//            return b;
//        }
//
//        return c;
//    }

    String getMonthName(int monthNum) {
        String month;

        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "INVALID";

            // NOT THE RIGHT WAY TO DO THIS
//            if (monthNum == 1) {
//                return "January";
//            } else if (monthNum == 2) {
//                return "February";
//            } else if (monthNum == 3) {
//                return "March";
//            } else if (monthNum == 4) {
//                return "April";
//            } else if (monthNum == 5) {
//                return "May";
//            } else if (monthNum == 6) {
//                return "June";
//            } else if (monthNum == 7) {
//                return "July";
//            } else if (monthNum == 8) {
//                return "August";
//            } else if (monthNum == 9) {
//                return "September";
//            } else if (monthNum == 10) {
//                return "October";
//            } else if (monthNum == 11) {
//                return "November";
//            }
//
//            return "December";
        }
        return month;
    }

}
