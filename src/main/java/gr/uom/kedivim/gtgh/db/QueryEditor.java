package gr.uom.kedivim.gtgh.db;

import gr.uom.kedivim.gtgh.db.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class QueryEditor {

    public static void printPersonsFromDB() {
        Connection connection = DBConnector.getConnectionMariaDB();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Select name from Person");
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Persons:");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> loadPersonsFromDB() {

        List<Person> personList = new ArrayList<>();

        try (Connection connectionMariaDB = DBConnector.getConnectionMariaDB()) {
            PreparedStatement preparedStatement =
                    connectionMariaDB.prepareStatement("Select * from person");

            personList = extractPersonsFromResults(preparedStatement);
        } catch (Exception ex) {
            System.err.println("Error while trying to query Persons from DB");
            ex.printStackTrace();
        }
        return personList;
    }

    public List<Person> searchPersonByAmka(String amkaToSearch) {

        try (Connection connectionMariaDB = DBConnector.getConnectionMariaDB()) {
            PreparedStatement ps = connectionMariaDB.prepareStatement("Select * from Person p where p.amka = ?");
            ps.setString(1, amkaToSearch); // is this ok?

            List<Person> personList = extractPersonsFromResults(ps);

            if (personList.size() > 1) {
                throw new RuntimeException("Two persons with same AMKA cannot exist. Error in data!");
            }
            return personList;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new RuntimeException("error while trying to search person by amka");
    }

    public List<Person> searchPersonByNameLike(String partOfName) {
        try (Connection conn = DBConnector.getConnectionMariaDB()) {
            PreparedStatement ps = conn.prepareStatement("Select * from Person p where p.name like ?");
            ps.setString(1, "%" + partOfName + "%");

            List<Person> personList = extractPersonsFromResults(ps);
            return personList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new RuntimeException("error while trying to search person by name");
    }

    public List<Person> searchPersonGreaterThanAge(int minAge) {
        List<Person> results = new ArrayList<>();
        try (Connection conn = DBConnector.getConnectionMariaDB()) {

            LocalDate dateToCompare =
                    LocalDate.of(LocalDate.now().getYear() - minAge,
                            LocalDate.now().getMonth(),
                            LocalDate.now().getDayOfMonth());

            PreparedStatement ps =
                    conn.prepareStatement("Select * from person p where p.birthdate < ?");

            ps.setObject(1, dateToCompare);

            results = extractPersonsFromResults(ps);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return results;
    }

    public void insertPerson(Person person){
        try(Connection connection = DBConnector.getConnectionMariaDB()){

            PreparedStatement ps = connection.
                    prepareStatement("insert into javauser.person(name,surname,amka,birthdate) " +
                    "values (?,?,?,?)");

            ps.setString(1, person.getName());
            ps.setString(2, person.getSurname());
            ps.setString(3, person.getAmka());
            ps.setObject(4, person.getBirthdate());

            int i = ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private List<Person> extractPersonsFromResults(PreparedStatement ps) {
        List<Person> personResults = new ArrayList<>();

        try {
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String amka = resultSet.getString("amka");
                LocalDate birthdate = resultSet.getObject("birthdate", LocalDate.class);

                Person person = new Person(name, surname, amka, birthdate);
                personResults.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personResults;
    }
}
