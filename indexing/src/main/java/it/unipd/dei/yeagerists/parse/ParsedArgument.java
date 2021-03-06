package it.unipd.dei.yeagerists.parse;

import lombok.*;

@Data // Generates getters/setters/tostring/hashcode/allargsconstructor
public class ParsedArgument {

    public final static class FIELDS {
        public static final String ID = "id";
        public static final String BODY = "body";
        public static final String STANCE = "stance";
        public static final String TITLE = "title";
    }

    @Setter(value = AccessLevel.NONE) // disable setter for this field
    @NonNull
    private final String id;

    @Setter(value = AccessLevel.NONE)
    @NonNull
    private final String body;

    @Setter(value = AccessLevel.NONE)
    @NonNull
    private final String stance;

    @Setter(value = AccessLevel.NONE)
    @NonNull
    private final String title;

    public boolean isValid() {
        return !body.isEmpty()
                && !id.isEmpty()
                && !stance.isEmpty() && (stance.equalsIgnoreCase("pro") || stance.equalsIgnoreCase("con"));
    }

}
