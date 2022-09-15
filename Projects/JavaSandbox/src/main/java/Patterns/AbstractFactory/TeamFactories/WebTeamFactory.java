package Patterns.AbstractFactory.TeamFactories;

import Patterns.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.AbstractFactory.Specialists.Web.WebJavaDeveloper;
import Patterns.AbstractFactory.Specialists.Web.WebProjectManager;
import Patterns.AbstractFactory.Specialists.Web.WebTester;
import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;

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
