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
    
    public Person(String name, String beruf, String geschlecht){
        this.name = name;
        this.beruf = beruf;
        this.geschlecht = geschlecht;
    }
    
    public String getName(){
        return this.name;
    }
}
