package rule;

import model.Action;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;

public class BookRule implements IBusinessRule {

    @Override
    public List<Action> execute(Product product) {
        List<Action> actions = new ArrayList();
        if (product.getProductType().equals(ProductType.BOOK)){
            actions.add(Action.DUPLICATE_PACKING_SLIP_FOR_ROYALTY);
        }
        return actions;
    }
}
