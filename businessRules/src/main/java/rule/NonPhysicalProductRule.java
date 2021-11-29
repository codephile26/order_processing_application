package rule;

import model.Action;
import model.Product;
import model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class NonPhysicalProductRule implements IBusinessRule{
    @Override
    public List<Action> execute(Product product) {
        List<Action> actions = new ArrayList<>();
        if (product.getProductCategory().equals(ProductCategory.NONPHYSICAL)){
            actions.add(Action.SEND_EMAIL_TO_OWNER);
        }
        return actions;
    }
}
