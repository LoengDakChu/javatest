package day10.work.work3;

public class Receptionist {
    private Filter f;


    public Receptionist() {
    }

    public Receptionist(Filter filter) {
        this.f = filter;
    }

    public void jieDai(User u) {
        if (u.getType() != null) {
            return;
        }
        if (f != null) {
            f.filterUser(u);
            return;
        } else {
            u.setType("A");
        }
    }


    public Filter getFilter() {
        return f;
    }

    public void setFilter(Filter filter) {
        this.f = filter;
    }

}
