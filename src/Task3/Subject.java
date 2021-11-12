package Task3;

public class Subject {
    private String subname;

    public Subject(final String subname) {
        if(subname!=null){
            this.subname = subname;
        } else {
            System.out.println("Invalid subname");
        }
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(final String subname) {
        if(subname!=null){
            this.subname = subname;
        } else {
            System.out.println("Invalid subname");
        }
    }

    @Override
    public String toString() {
        return subname;
    }
}