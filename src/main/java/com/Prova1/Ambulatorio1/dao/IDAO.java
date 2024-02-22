package main.java.com.Prova1.Ambulatorio1.dao;

import java.util.Map;

public interface IDAO {
    public interface IDAO {
    public void create(Entity e);

    public Map<Integer, Entity> read();

    public void update(Entity e);

    public void delete(int id);


}
}
