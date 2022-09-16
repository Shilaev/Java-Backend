package Patterns.Creational.AbstractFactory.Specialists.PC;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;

public class PCProjectManager implements ProjectManager {

    @Override
    public void getManagement() {
        System.out.println("PC management");
    }
}
