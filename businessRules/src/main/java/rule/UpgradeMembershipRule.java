package rule;

import model.Action;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;

public class UpgradeMembershipRule implements IBusinessRule{
    @Override
    public List<Action> execute(Product product) {
        List<Action> actions = new ArrayList<>();
        if (product.getProductType().equals(ProductType.MEMBERSHIP_UPGRADE)){
            actions.add(Action.APPLY_UPGRADE_TO_MEMBERSHIP);
        }
        return actions;
    }
}
