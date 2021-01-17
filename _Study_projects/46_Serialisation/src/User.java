import java.io.Serializable;
import java.util.Objects;

public class User {

    int liveLevel;
    static int staticField;
    transient Sword sword;

    //Если Sword не наследуется от Serializable,
    // то помечаем transient поля, которые не будут сериализованы
//    int liveLevel;
//    static int staticField;
//    transient Sword sword;


    public int getLiveLevel() {
        return liveLevel;
    }

    public void setLiveLevel(int liveLevel) {
        this.liveLevel = liveLevel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return liveLevel == user.liveLevel &&
                Objects.equals(sword, user.sword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveLevel, sword);
    }
}
