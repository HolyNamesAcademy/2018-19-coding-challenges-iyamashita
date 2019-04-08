package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
        int large;
        int medium;
        int small;
        if (a>b && b>c && a>c)
        {
            large = a;
            medium = b;
            small = c;
            if ((large-medium)==(medium-small))
            {
                return true;
            }
        }


        if (b>a && a>c && b>c)
        {
            large = b;
            medium = a;
            small = c;
            if ((large-medium)==(medium-small))
            {
                return true;
            }
        }

        // Delete the line below and implement the method!

    }
}
