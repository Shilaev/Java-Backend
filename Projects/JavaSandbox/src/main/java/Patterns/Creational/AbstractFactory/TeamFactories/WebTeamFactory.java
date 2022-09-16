package Patterns.Creational.AbstractFactory.TeamFactories;

import Patterns.Creational.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.Creational.AbstractFactory.Specialists.Web.WebJavaDeveloper;
import Patterns.Creational.AbstractFactory.Specialists.Web.WebProjectManager;
import Patterns.Creational.AbstractFactory.Specialists.Web.WebTester;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;

public class WebTeamFactory implements TeamFactory {

    @Override
    public Developer getDeveloper() {
        return new WebJavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebProjectManager();
    }

    @Override
    public Tester getTester() {
        return new WebTester();
    }
}
