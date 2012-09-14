import javax.annotation.Nullable;

import com.google.common.base.Function;

public final class NonNullWarning implements Function<MyBean, String> {
    @Nullable
    public String apply(@Nullable MyBean input) {
        return input.field;
    }
}

class MyBean {
    String field = ":P";
}