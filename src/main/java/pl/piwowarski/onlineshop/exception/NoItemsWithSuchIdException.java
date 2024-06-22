package pl.piwowarski.onlineshop.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NoItemsWithSuchIdException extends RuntimeException {

    private String message;
}
