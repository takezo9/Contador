public class ParametrosInvalidosException extends Exception {
/*
*
* Se o primeiro parâmetro for maior ou igual ao segundo parâmetro essa exceção
* é lançada.
 */
    public ParametrosInvalidosException(String errorMessage) {
        super(errorMessage);
    }
}
