package rule;

import model.Action;
import model.Product;
import model.ProductType;

public class UpgradeMembershipRule implements IBusinessRule{
    @Override
    public Action execute(Product product) {
        if (product.getProductType().equals(ProductType.MEMBERSHIP_UPGRADE)){
            return Action.APPLY_UPGRADE_TO_MEMBERSHIP;
        }
        return null;
    }
}
