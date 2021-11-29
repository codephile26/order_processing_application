package rule;

import model.Action;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;

public class MembershipRule implements IBusinessRule{
    @Override
    public List<Action> execute(Product product) {
        List<Action> actions = new ArrayList<>();
        if (product.getProductType().equals(ProductType.MEMBERSHIP)){
            actions.add(Action.ACTIVATE_MEMBERSHIP);
        }
        return actions;
    }
}
