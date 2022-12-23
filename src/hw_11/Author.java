package hw_11;

public class Author {
        private String authorFirstName;
        private String authorLastName;
        private String authorMiddleName;


        public Author (String authorFirstName, String authorLastName, String authorMiddleName) {

                this.authorFirstName = authorFirstName;
                this.authorLastName = authorLastName;
                this.authorMiddleName = authorMiddleName;
        }

        public String getAuthorFirstName() {
                return this.authorFirstName;
        }

        public String getAuthorLastName() {
                return this.authorLastName;
        }

        public String getAuthorMiddleName() {
                return this.authorMiddleName;
        }

}


