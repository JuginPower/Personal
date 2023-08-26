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
    
    private String name;
    private String beruf;
    private String geschlecht;
    
    public Person(String eingabeName, String eingabeBeruf, String eingabeGeschlecht){
        
        this.name = eingabeName;
        this.beruf = eingabeBeruf;
        this.geschlecht = eingabeGeschlecht;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getBeruf(){
        return this.beruf;
    }
}
