public class Section {

    private String name;
    private String text;

    public Section() {
        text = "Это тестовый текст";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
