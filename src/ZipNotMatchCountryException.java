
public class ZipNotMatchCountryException extends RuntimeException {
	public ZipNotMatchCountryException () {
		super("USA must be 6 digits and Canada must be 5 digits. ");
	}
}
