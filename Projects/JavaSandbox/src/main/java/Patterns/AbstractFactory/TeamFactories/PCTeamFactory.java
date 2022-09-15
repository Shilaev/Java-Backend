package Patterns.AbstractFactory.TeamFactories;

import Patterns.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.AbstractFactory.Specialists.PC.PCJavaDeveloper;
import Patterns.AbstractFactory.Specialists.PC.PCProjectManager;
import Patterns.AbstractFactory.Specialists.PC.PCTester;
import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;

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
