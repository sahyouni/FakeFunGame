
public class Quotation {

	private String _quotation;
	private String _author;

	public void SetQuotation(String value) {

		if (value == null || value.length() == 0) {
			throw new IllegalArgumentException("Exception message");
		}
		_quotation = value;
	}

	public void SetAuthor(String value) {

		if (value == null || value.length() == 0) {
			throw new IllegalArgumentException("Exception message");
		}
		_author = value;
	}

	public String GetQuotation(){Î
		return _quotation;
	}

	public String GetAuthor() {
		return _author;
	}

	public Quotation(String quotation, String author) {

		SetQuotation(quotation);
		SetAuthor(author);
	}

}
