package noemibaglieri;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EventManager {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4W3D2CRUD");

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
