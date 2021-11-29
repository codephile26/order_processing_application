package rule;

import model.Action;
import model.Product;

public interface IBusinessRule {

    public Action execute(Product product);

}
