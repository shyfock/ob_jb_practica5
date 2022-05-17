import classes.CocheCRUDImpl;
import interfaces.CocheCRUD;

public class Main {
    public static void main(String[] args) throws Exception {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
