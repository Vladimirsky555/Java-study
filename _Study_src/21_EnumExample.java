//Enum удобен для перечислений

public class EnumExample {

//    enum coffeSize{
//        SMALL,
//        MEDIUM,
//        BIG
//    };

    //enum coffeSize{ SMALL(100), MEDIUM(200), BIG(300);

    enum coffeSize{ SMALL(100), MEDIUM(200), BIG(300) {
        String getCoffeClass() {
            return "B";
        }
    };

        String coffeClass = "A";
        int millilitr;

    coffeSize(int i){
        this.millilitr = i;
     }

     int getMillilitr(){
        return millilitr;
     }

      String getCoffeClass() {
            return coffeClass;
        }
    }


    public static void main(String[] args){
        coffeSize cs = coffeSize.BIG;
        System.out.println(cs);
        System.out.println(cs.getMillilitr());
        System.out.println(cs.getCoffeClass());
    }
}

//class CoffeSize2{
//    public static final coffeSize2 SMALL = new coffeSize2();
//    public static final coffeSize2 MEDIUM = new coffeSize2();
//    public static final coffeSize2 BIG = new coffeSize2();
//}
