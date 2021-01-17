import java.util.List;
import java.util.Vector;

public class Book {

    private String name;
    private List chapters = new Vector();

    public Book() {
        chapters.add("1 часть");
        chapters.add("2 часть");
        chapters.add("3 часть");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getChapters() {
        return chapters;
    }

    public void setChapters(List chapters) {
        this.chapters = chapters;
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }


    @Override
    public String toString() {
        return this.name;
    }
}
