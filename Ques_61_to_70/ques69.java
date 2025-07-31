package Ques_61_to_70;

import java.beans.PropertyChangeSupport;

// Observer Pattern (Property Change Listener)

public class ques69 {
     public static void main(String[] args) {
        PropertyChangeSupport support = new PropertyChangeSupport(new Object());
        
        support.addPropertyChangeListener(evt -> {
            System.out.println("Property changed: " + 
                evt.getPropertyName() + " from " + 
                evt.getOldValue() + " to " + 
                evt.getNewValue());
        });
        
        support.firePropertyChange("status", null, "active");
    }
}
