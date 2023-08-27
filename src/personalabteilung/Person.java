/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalabteilung;

/**
 *
 * @author kraft
 */
public class Person {
    
    private String vorname;
    private String name;
    private String beruf;
    private String geschlecht;
    private String geburtsdatum;
    
    public Person(String eingabeVorname, String eingabeName, String eingabeBeruf, String eingabeGeschlecht, String eingabeGeburtsdatum){
        
        this.vorname = eingabeVorname;
        this.name = eingabeName;
        this.beruf = eingabeBeruf;
        this.geschlecht = eingabeGeschlecht;
        this.geburtsdatum = eingabeGeburtsdatum;
    }
    
    public String getBday(){
        return this.geburtsdatum;
    }
    
    public String getVorname(){
        return this.vorname;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getBeruf(){
        return this.beruf;
    }
    
    @Override
    public String toString() {
        return "Vorname: " + vorname + "\nName: " + name + "\nBeruf: " + 
                beruf +"\nGeburtsdatum: " + geburtsdatum + "\nGeschlecht: " + geschlecht;
    }
}
