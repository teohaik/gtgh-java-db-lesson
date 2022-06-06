package gr.uom.kedivim.gtgh.db;

import gr.uom.kedivim.gtgh.db.model.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        QueryEditor queryEditor = new QueryEditor();
        queryEditor.loadPersonsFromDB();

        // searchByAmkaExample(queryEditor);

       // searchByNameExample(queryEditor);

        //searchByBirthdateExample(queryEditor);

        System.out.println("Insert Data");
        System.out.println("Type user info or 'exit' to exit, ok?");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        while(!"exit".equalsIgnoreCase(next)){
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Surname");
            String surname = scanner.next();
            System.out.println("Amka");
            String amka = scanner.next();
            System.out.println("Birthdate in format: DD/MM/YYYY");
            String birthdateString = scanner.next();
            LocalDate birthdate = LocalDate.parse(birthdateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Person person = new Person(name, surname, amka, birthdate);
            queryEditor.insertPerson(person);
            System.out.println("Continue or exit? ");
            next = scanner.next();
        }

    }

    private static void searchByBirthdateExample(QueryEditor queryEditor) {
        System.out.println("Give minimum age");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int minAge = Integer.parseInt(next);

        List<Person> results = queryEditor.searchPersonGreaterThanAge(minAge);

        System.out.println("Persons greater than "+minAge+" years old: ");
        for(Person p : results)
            System.out.println(p);
    }

    private static void searchByNameExample(QueryEditor queryEditor) {
        System.out.println("Give part of name to search");

        Scanner scanner = new Scanner(System.in);
        String partOfName = scanner.next();
        System.out.println("You are searching for persons with name like ' "+partOfName+" ' ");
        List<Person> personList = queryEditor.searchPersonByNameLike(partOfName);

        System.out.println("results:");
        for(Person p : personList){
            System.out.println(p);
        }
    }

    private static void searchByAmkaExample(QueryEditor queryEditor) {
        System.out.println("Give amka to search");
        Scanner scanner = new Scanner(System.in);
        String amkaToSearch = scanner.next();

        System.out.println("You want to search user with amka = "+amkaToSearch);

        List<Person> personList = queryEditor.searchPersonByAmka(amkaToSearch);
        System.out.println("Person found ");
        for(Person p : personList){
            System.out.println(p);
        }
    }
}
