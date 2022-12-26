package hw_11;

import java.util.Objects;

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

        @Override
        public String toString() {
                return authorMiddleName + " " + authorFirstName + " " + authorLastName;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Author author = (Author) o;
                return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLastName, author.authorLastName) && Objects.equals(authorMiddleName, author.authorMiddleName);
        }

        @Override
        public int hashCode() {
                return Objects.hash(authorFirstName, authorLastName, authorMiddleName);
        }
}


