package jfx_prop1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    
    private StringProperty name = new SimpleStringProperty(this, "nameProperty", "Marek") ;

    public StringProperty getName() {
        return this.name;
    }

    public void setName(StringProperty name) {
        this.name = name;
    }

}