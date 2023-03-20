package pl.sda.person;

public class Person {


        private String prefix;
        private String firstName;
        private String lastName;

        public Person() {

        }

        public Person(String prefix, String firstName, String lastName) {
            this.prefix = prefix;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

}
