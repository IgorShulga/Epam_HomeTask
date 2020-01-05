package ua.ihorshulha.ht_09.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, OfficeSlave> workers = new HashMap<>();

    public OfficeSlave getOfficeSlave(String specialty) {
        OfficeSlave officeSlave = workers.get(specialty);

        if (officeSlave == null) {
            switch (specialty) {
                case "manager":
                    System.out.println("Hiring manager...");
                    officeSlave = new Manager();
                    break;
                case "clerk":
                    System.out.println("Hiring clerk...");
                    officeSlave = new Clerk();
            }
            workers.put(specialty, officeSlave);
        }
        return officeSlave;
    }
}
