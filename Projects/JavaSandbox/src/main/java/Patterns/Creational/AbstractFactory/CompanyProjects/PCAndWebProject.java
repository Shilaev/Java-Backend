package Patterns.Creational.AbstractFactory.CompanyProjects;

import Patterns.Creational.AbstractFactory.FactoryInterfaces.TeamFactory;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;
import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;
import Patterns.Creational.AbstractFactory.TeamFactories.PCTeamFactory;
import Patterns.Creational.AbstractFactory.TeamFactories.WebTeamFactory;

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
