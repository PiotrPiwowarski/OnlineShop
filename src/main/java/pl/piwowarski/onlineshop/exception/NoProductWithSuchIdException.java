package pl.piwowarski.onlineshop.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NoProductWithSuchIdException extends RuntimeException {

    private String message;
}
