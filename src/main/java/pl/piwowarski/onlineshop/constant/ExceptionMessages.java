package pl.piwowarski.onlineshop.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ExceptionMessages {

    public static final String NO_ITEM_WITH_SUCH_ID_EXCEPTION_MESSAGE = "Brak przedmiotów o podanym id";
    public static final String WRONG_ITEM_TYPE_EXCEPTION_MESSAGE = "Błędny typ przedmiotu";
}
