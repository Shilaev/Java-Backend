package ru.shilaev.DAO;

import org.springframework.stereotype.Component;
import ru.shilaev.models.Person;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Component
public class PersonDao {
    private static final String URL = "jdbc:postgresql://localhost:5432/people";
    private static final String USERNAME = "postgres";
    private static final String PASWORD = "voland";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Person> index() {
        List<Person> personList = new LinkedList<>();

        try {
//            Statement statement = connection.createStatement();
//            String selectAllFromPerson = "SELECT * FROM person ORDER BY person.ID";
//            ResultSet resultSet = statement.executeQuery(selectAllFromPerson);

            PreparedStatement selectAllFromPersonOrderById =
                    connection.prepareStatement("SELECT * FROM person ORDER BY person.id;");
            ResultSet resultSet = selectAllFromPersonOrderById.executeQuery();

            while (resultSet.next()) {
                Person person = new Person(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("email")
                );
                personList.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personList;
    }

    public Person getPersonById(int id) {
        Person resultPerson = null;
        try {
            PreparedStatement selectPersonById =
                    connection.prepareStatement("SELECT * FROM person WHERE person.id = ?");
            selectPersonById.setInt(1, id);

            ResultSet selectPersonByIdResult = selectPersonById.executeQuery();
            selectPersonByIdResult.next();

            resultPerson = new Person(
                    selectPersonByIdResult.getInt("id"),
                    selectPersonByIdResult.getString("name"),
                    selectPersonByIdResult.getInt("age"),
                    selectPersonByIdResult.getString("email")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultPerson;
    }

    public void addNewPerson(Person newPerson) {

        try {
//            Statement statement = null;
//            statement = connection.createStatement();
//            String insertIntoPerson = "insert into person (name, age, email) VALUES" + "("
//                    + "'" + newPerson.getName() + "'" + ","
//                    + newPerson.getAge() + ","
//                    + "'" + newPerson.getEmail() + "'"
//                    + ")";
//            statement.executeUpdate(insertIntoPerson);

            PreparedStatement insertIntoPerson =
                    connection.prepareStatement("INSERT INTO person (name, age, email) VALUES (?,?,?)");
            insertIntoPerson.setString(1, newPerson.getName());
            insertIntoPerson.setInt(2, newPerson.getAge());
            insertIntoPerson.setString(3, newPerson.getEmail());

            insertIntoPerson.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePerson(int id, Person person) {
        try {
            PreparedStatement updatePersonById = connection.prepareStatement(
                    "UPDATE person\n" +
                            "SET name=?, age=?, email=?\n" +
                            "WHERE id=?");

            updatePersonById.setString(1, person.getName());
            updatePersonById.setInt(2, person.getAge());
            updatePersonById.setString(3, person.getEmail());

            updatePersonById.setInt(4, id);

            updatePersonById.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePerson(int id) {
        try {
            PreparedStatement deletePersonById =
                    connection.prepareStatement("DELETE FROM person WHERE person.id = ?");
            deletePersonById.setInt(1, id);

            deletePersonById.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
