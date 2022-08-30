package HomeWork2;

import java.util.Objects;

public class Author2 {
        private String fName;
        private String sName;

        public Author2 (String fName, String sName) {
            this.fName = fName;
            this.sName = sName;
        }
               public String toString() {
            return fName + " " + sName;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author2 author2 = (Author2) o;
        return fName.equals(author2.fName) && sName.equals(author2.sName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, sName);
    }
}

