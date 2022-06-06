package gr.uom.kedivim.gtgh.db;

import gr.uom.kedivim.gtgh.db.model.Person;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        QueryEditor queryEditor = new QueryEditor();
        queryEditor.loadPersonsFromDB();

        // searchByAmkaExample(queryEditor);

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
