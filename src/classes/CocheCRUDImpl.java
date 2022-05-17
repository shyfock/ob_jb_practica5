package classes;

import interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Estás en el método save de CocheCRUD");

    }

    @Override
    public void findAll() {
        System.out.println("Estás en el método findAll de CocheCRUD");

    }

    @Override
    public void delete() {
        System.out.println("Estás en el método delete de CocheCRUD");

    }

}
