package Patterns.AbstractFactory.FactoryInterfaces;

import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;

public interface TeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
