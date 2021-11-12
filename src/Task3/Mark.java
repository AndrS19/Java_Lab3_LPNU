package Task3;

import java.util.ArrayList;
import java.util.List;

public class Mark {

    public List<Integer> mark = new ArrayList<>();

    public Mark(final List<Integer> mark) {
        this.mark = mark;
    }

    public Mark() {
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(final List<Integer> mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "" + mark;
    }
}