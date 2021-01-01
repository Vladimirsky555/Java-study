public class SwitchExampl {

    enum Days{ MONDAY, THURSDAY, WENSDAY, FRIDAY, SATERDAY, SUNDAY}

    public static void main(String[] args) {

        Days days = Days.FRIDAY;
//        switch (days){
//            case MONDAY:
//                System.out.println(1);
//                break;
//            case THURSDAY:
//                System.out.println(2);
//                break;
//            case WENSDAY:
//                System.out.println(3);
//                break;
//            case FRIDAY:
//                System.out.println(4);
//                break;
//            case SATERDAY:
//                System.out.println(5);
//                break;
//            case SUNDAY:
//                System.out.println(6);
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }

        //Без break выполнятся все кейсы начиная с совпавшего
//        switch (days){
//            case MONDAY:
//                System.out.println(1);
//            case THURSDAY:
//                System.out.println(2);
//            case WENSDAY:
//                System.out.println(3);
//            case FRIDAY:
//                System.out.println(4);
//            case SATERDAY:
//                System.out.println(5);
//            case SUNDAY:
//                System.out.println(6);
//            default:
//                System.out.println("default");
//        }


        /*
        Если перенести default выше, то если совпадений не обнаружено,\
        выполнятся все кейсы, начиная с default
         */
        int i = 10;

        switch (i){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            default:
                System.out.println("default");
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);

        }
    }
}
