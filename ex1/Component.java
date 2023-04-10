package ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    private List<ValidationStrategy> listValid;

    public Component() {
         listValid = new ArrayList<>();;
    }

    public void addValidStrategy(ValidationStrategy element) {
        if (!listValid.contains(element))
            listValid.add(element);
    }

    public void removeValidStrategy(ValidationStrategy element) {
        listValid.remove(element);
    }

    public boolean validate(String data) {
        for (ValidationStrategy element : listValid) {
            if (!element.validate(data)) {
                System.out.println(element.getClass().getName());
                return false;
            }
        }
        return true;
    }
}
