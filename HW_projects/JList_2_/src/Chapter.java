import java.util.List;
import java.util.Vector;

public class Chapter {

    private String name;
    private List sections = new Vector();

    public Chapter() {
        sections.add("1 параграф");
        sections.add("2 параграф");
        sections.add("3 параграф");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getSections() {
        return sections;
    }

    public void setSections(List sections) {
        this.sections = sections;
    }

    public void addSection(Section section){
        sections.add(section);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
