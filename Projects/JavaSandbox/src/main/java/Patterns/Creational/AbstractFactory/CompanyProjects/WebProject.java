package Patterns.Creational.AbstractFactory.CompanyProjects;

import Patterns.Creational.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;
import Patterns.Creational.AbstractFactory.TeamFactories.WebTeamFactory;

public class WebProject {
    public static void main(String[] args) {
        TeamFactory webTeamFactory = new WebTeamFactory();

        Developer developer = webTeamFactory.getDeveloper();
        Tester tester = webTeamFactory.getTester();
        ProjectManager projectManager = webTeamFactory.getProjectManager();

        developer.getCode();
        tester.getTest();
        projectManager.getManagement();
    }
}
