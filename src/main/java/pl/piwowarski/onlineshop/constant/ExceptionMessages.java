package pl.piwowarski.onlineshop.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ExceptionMessages {

    public static final String NO_PRODUCT_WITH_SUCH_ID_EXCEPTION_MESSAGE = "Brak produktów o podanym id";
    public static final String WRONG_PRODUCT_TYPE_EXCEPTION_MESSAGE = "Błędny typ produktu";
}
