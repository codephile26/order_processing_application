package rule;

import model.Action;
import model.Product;
import model.ProductType;

public class MembershipRule implements IBusinessRule{
    @Override
    public Action execute(Product product) {
        if (product.getProductType().equals(ProductType.MEMBERSHIP)){
            return Action.ACTIVATE_MEMBERSHIP;
        }
        return null;
    }
}
