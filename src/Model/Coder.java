package Model;

import java.security.PrivateKey;

public class Coder extends Person {
    private String Programming_Language;

    public Coder() {

    }

    public Coder(String programming_Language) {
        Programming_Language = programming_Language;
    }

    public Coder(String name, int age, String phone, String programming_Language) {
        super(name, age, phone);
        Programming_Language = programming_Language;
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language(String programming_Language) {
        Programming_Language = programming_Language;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "Programming_Language='" + Programming_Language + '\'' +
                '}';
    }
}
