package tk.farafonoff.sos.exceptions;

/**
 * Created by faraf on 29.12.2016.
 */
public class DAOException extends RuntimeException {
    public DAOException(String text) {
        super(text);
    }
}
