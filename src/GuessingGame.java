import java.util.ArrayList;
import java.util.*;

public class GuessingGame {

    private ArrayList<Quotation> _quotations;

    public ArrayList<Quotation> GetQuotations() {
        return _quotations;
    }

    private void addQuotation(Quotation toAdd) {
        if (toAdd != null) {
            _quotations.add(toAdd);
        }
    }

    private void populateQuotationList() {
        _quotations.clear();

        addQuotation(new Quotation("Be yourself; everyone else is taken", "Oscar Wilde"));
        addQuotation(new Quotation("you only live once, but if you do it right, once is enough", "Mae West"));
        // add other boring quotations
    }

    private int getListSize() {
        return _quotations.size();
    }

    private void getQuotationByIndex(int index) {

        if (getListSize() > index) {
            Quotation quotation = (Quotation) _quotations.get(index);
            System.out.println(quotation.GetQuotation() + "by " + quotation.GetAuthor());
        }
    }

    private void deleteQuotation(String quotation) {

        if (quotation != null && quotation.length() > 0) {

            Iterator<Quotation> iter = _quotations.iterator();

            while (iter.hasNext()) {
                Quotation currentQuotation = iter.next();

                if (currentQuotation.GetQuotation() == quotation) {
                    _quotations.remove(currentQuotation);
                }
            }
        }
    }

    private void getQuotationByAuthor(String author) {

        if (author == null || author.length() == 0) {
            throw new IllegalArgumentException("Exception message");
        }

        Iterator<Quotation> iter = _quotations.iterator();

        Boolean foundOne = false;

        while (iter.hasNext()) {
            Quotation currentQuotation = iter.next();

            if (currentQuotation.GetAuthor() == author) {
                foundOne = true;
                System.out.println(currentQuotation.GetQuotation());
            }
        }

        if (!foundOne) {
            System.out.println("no quotations for author: " + author + " were found.");
        }
    }

    private void playGame(){
        
    }

    public GuessingGame() {
        _quotations = new ArrayList<>();
    }

}
