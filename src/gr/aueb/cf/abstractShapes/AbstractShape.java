package gr.aueb.cf.abstractShapes;

public abstract class AbstractShape implements IShape{
    private long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
