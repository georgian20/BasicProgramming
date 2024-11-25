package multimiSiStructuriRepetitive;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    //Structurile repetitive sunt blocuri de cod care parcurg un anumit interval de valori.
    //for; while; foreach
    //In java un array(multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip
    //(primitive sau de referinta)
    //un array are o dimensiune fixa, nu se poate schimba

    @Test
    public void afisareDate() {
//        colegiDeCursArray();
//        colegiDeCursLista();
//        exempluHashMap1();
        exempluHashMap2();
    }

    public void colegiDeCursArray() {
        String[] colegi = new String[7];
        colegi[0] = "Senty";
        colegi[1] = "Edi";
        colegi[2] = "Gabi";
        colegi[3] = "Ionut";
        colegi[4] = "Ramona";
        colegi[5] = "Mihai";
        colegi[6] = "Andreea";

        // for(initializarea; conditie; increment){
        // in interior o sa se execute un bloc de cod in mod repetat
        // }
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului de la numarul: " + index + " este: " + colegi[index]);
        }
    }
        //Listele sunt o colectie ordonate de elemente (sunt mai flexibile, putem adauga elemente)
        //Fiecare element poate fi accesat printr-un index numeric
        //Elementele intr-o lista sunt stocate in ordinea in care sunt adaugate
        //Ca implementare se foloseste ArrayList

        public void colegiDeCursLista () {
            List<String> colegiLista = new ArrayList<>();
            colegiLista.add("Senty");
            colegiLista.add("Edi");
            colegiLista.add("Gabi");
            colegiLista.add("Ionut");
            colegiLista.add("Ramona");
            colegiLista.add("Mihai");
            colegiLista.add("Andreea");
            colegiLista.add("Fabian");

            //while este o structura de control utilizata pentru a executa in mod repetat un bloc de cod
            //atata timp cat o conditieeste adevarata (similar cu for)
            //index
            //while(conditia){
            //blod ce cod care se executa repetat daca conditia e adevarata
            //index++
            //}

            int index = 0;
            while (index < colegiLista.size()) {
                System.out.println("Numele colegului este: " + colegiLista.get(index));
                index++;
            }

            //hashmap este o implementare a unei colectii de tip pereche (cheie/valoare)
            //fiecare element din hashmap este o pereche formata dintr-o cheie si o valoare asociata cu acea cheie
            //cheile sunt unice, nu pot fi duplicate
        }
        public void exempluHashMap1 () {
            HashMap<String, String> categoriiLucruri = new HashMap<>();
            categoriiLucruri.put("Flori", "Trandafir");
            categoriiLucruri.put("Fructe", "Para");
            categoriiLucruri.put("Legume", "Cartof");
            categoriiLucruri.put("Condimente", "Sare");

            //foreach este o structura alternativa mai avansata a unui for
            // se poate utiliza sa iteram prontr-o colectie afara a fi nevoie sa se utilizeze un index
            //foreach(tipul de element/String numele: colectia){
            //bloc de cod care se executa repetat pentru fiecare element din colectie
            //}

            for (String key : categoriiLucruri.keySet()) {
                System.out.println("Categoria este: " + key + " obiectul din categorie este: " + categoriiLucruri.get(key));
            }
        }

        public void exempluHashMap2 () {
            HashMap<String, List<String>> tariSiOrase = new HashMap<>();
            List<String> oraseRomania = new ArrayList<>();
            oraseRomania.add("Cluj");
            oraseRomania.add("Timisoara");
            oraseRomania.add("Bucuresti");
            oraseRomania.add("Brasov");

            List<String> oraseSpania = new ArrayList<>();
            oraseSpania.add("Barcelona");
            oraseSpania.add("Sevilla");
            oraseSpania.add("Madrid");
            oraseSpania.add("Griona");

            List<String> oraseItalia = new ArrayList<>();
            oraseItalia.add("Roma");
            oraseItalia.add("Torino");
            oraseItalia.add("Venetia");
            oraseItalia.add("Genova");

            List<String> oraseGermania = new ArrayList<>();
            oraseGermania.add("Stuttgart");
            oraseGermania.add("Berlin");
            oraseGermania.add("Koln");
            oraseGermania.add("Dusseldorf");

            tariSiOrase.put("Romania", oraseRomania);
            tariSiOrase.put("Spania", oraseSpania);
            tariSiOrase.put("Italia", oraseItalia);
            tariSiOrase.put("Germania", oraseGermania);

            for (String key:tariSiOrase.keySet()){
                System.out.println("Orasele din tara "+key+" sunt: "+tariSiOrase.get(key));
            }
        }

        //Tema - de facut ce am facut miercuri pe un exemplu cu masini din tari diferite
    // de tip hashmap 2 si string
    //4 perechi in hashmap
    //dintr-o lista de string-uri cautam un string dorit
    //trebuie sa facem o lista de string
    //variabila de string
    //parcurgem lista cu un for sau while
    //cand ajungem la cuvantul dorit il introducem in consola si folosim if
}