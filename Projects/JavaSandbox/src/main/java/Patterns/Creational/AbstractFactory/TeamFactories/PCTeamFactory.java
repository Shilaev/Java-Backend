package Patterns.Creational.AbstractFactory.TeamFactories;

import Patterns.Creational.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.Creational.AbstractFactory.Specialists.PC.PCJavaDeveloper;
import Patterns.Creational.AbstractFactory.Specialists.PC.PCProjectManager;
import Patterns.Creational.AbstractFactory.Specialists.PC.PCTester;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;

public class PCTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PCJavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PCProjectManager();
    }

    @Override
    public Tester getTester() {
        return new PCTester();
    }
}
