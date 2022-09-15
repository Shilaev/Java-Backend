package Patterns.AbstractFactory.CompanyProjects;

import Patterns.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;
import Patterns.AbstractFactory.TeamFactories.PCTeamFactory;
import Patterns.AbstractFactory.TeamFactories.WebTeamFactory;

public class PCAndWebProject {
    public static void main(String[] args) {
        TeamFactory pcTeamFactory = new PCTeamFactory();
        TeamFactory webTeamFactory = new WebTeamFactory();

        Developer pcDeveloper = pcTeamFactory.getDeveloper();
        Tester pcTester = pcTeamFactory.getTester();
        ProjectManager pcProjectManager = pcTeamFactory.getProjectManager();

        Developer webDeveloper = webTeamFactory.getDeveloper();
        Tester webTester = webTeamFactory.getTester();
        ProjectManager webProjectManager = webTeamFactory.getProjectManager();

        pcDeveloper.getCode();
        pcTester.getTest();
        pcProjectManager.getManagement();

        webDeveloper.getCode();
        webTester.getTest();
        webProjectManager.getManagement();
    }
}
