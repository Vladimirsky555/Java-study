public class ConstractorExample {

    int i;

    ConstractorExample(String hello, int i){
      System.out.println(hello + " Run");
      this.i = i;
    }

    ConstractorExample(){
        System.out.println("без параметров");
    }

    ConstractorExample(String hello){
        System.out.println(hello);
    }

//    void ConstractorExample(String hello, int i){
//        System.out.println(hello + " Run");
//        this.i = i;
//    }
}

class Run {
    public static void main(String[] args){
        ConstractorExample constractorExample = new ConstractorExample("Hello", 3);
        System.out.println(constractorExample.i);

//        ConstractorExample ce = new ConstractorExample();
//        ce.ConstractorExample("hello", 2);

        ConstractorExample ce = new ConstractorExample();
        ConstractorExample ce2 = new ConstractorExample("Привет!!!");

    }
}
