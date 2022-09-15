package Patterns.AbstractFactory.Specialists.PC;

import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;

public class PCProjectManager implements ProjectManager {

    @Override
    public void getManagement() {
        System.out.println("PC management");
    }
}
