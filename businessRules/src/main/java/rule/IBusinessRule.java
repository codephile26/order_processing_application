package rule;

import model.Action;
import model.Product;

import java.util.List;

public interface IBusinessRule {

    public List<Action> execute(Product product);

}
