package Patterns.AbstractFactory.CompanyProjects;

import Patterns.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;
import Patterns.AbstractFactory.TeamFactories.WebTeamFactory;

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
