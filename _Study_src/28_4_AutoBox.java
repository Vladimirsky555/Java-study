public class AutoBox {
    public static void main(String[] args) {
//        Integer i = new Integer(1);
//        Integer j = new Integer(1);

        Integer i = 128;
        Integer j = 128;//до 127 будет находиться в одном участке памяти

        //Сравнивает значения
        if(i.equals(j)){
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        //разные участки памяти
        if(i == j){
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
    }

}
