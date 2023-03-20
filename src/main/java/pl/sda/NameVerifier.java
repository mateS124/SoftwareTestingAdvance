package pl.sda;

public class NameVerifier {
    boolean isNameValid(String name){
        return name != null
                && name.length() > 0
                && !name.equals(name.toUpperCase()) // ABC - falsz, abc - fałsz
                && !name.equals(name.toLowerCase()); // ABC - falsz, abc - fałsz
    }
}
