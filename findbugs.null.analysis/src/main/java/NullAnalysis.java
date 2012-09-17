import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * http://stackoverflow.com/questions/12301570/javax-annotation-nullable-vs-checkfornull/12302700#
 * 12302700
 */
public class NullAnalysis {

    public @Nullable
    String nullable() {
        return "";
    }

    public @Nonnull
    String nonnull() {
        return null; // IDEA, FindBugs (NP_NONNULL_RETURN_VIOLATION)
    }

    public @CheckForNull
    String checkForNull() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new NullAnalysis().nullable().length()); // IDEA, Eclipse
        System.out.println(new NullAnalysis().nonnull().length());
        System.out.println(new NullAnalysis().checkForNull().length());
    }
}