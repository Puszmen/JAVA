package pl.javastart.library.model;

import java.io.Serializable;
import java.util.Arrays;

public class Library implements Serializable {

    private static final int INITIAL_CAPACITY = 1;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[INITIAL_CAPACITY];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }
    public void addPublication (Publication publication) {

        if (publicationsNumber == publications.length) {
            publications = Arrays.copyOf(publications, publications.length * 2);
        }
            publications[publicationsNumber] = publication;
            publicationsNumber++;
    }

    public boolean removePublication (Publication pub) {
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < publicationsNumber && foundIndex == notFound; i++) {
            if (pub.equals(publications[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
        System.arraycopy(publications,foundIndex + 1,publications,foundIndex,publications.length - foundIndex - 1);
        publicationsNumber--;
        publications[publicationsNumber] = null;
        }
        return foundIndex != notFound;
    }
}
