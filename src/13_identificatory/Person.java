public class Person {
    private String name;
    private boolean blond;

    public boolean isBlond() {
       return blond;
    }

    public void setBlond(boolean blond) {
        this.blond = blond;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        String tmp;
        if(blond){
            tmp = "блондин";
        } else {
            tmp = "не блондин";
        }

        return name + " " + tmp;
    }


}
