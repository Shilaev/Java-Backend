package Patterns.Creational.AbstractFactory.FactoryInterfaces;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;

public interface TeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
