package rule;

import model.Action;
import model.Product;
import model.ProductType;

public class BookRule implements IBusinessRule {

    @Override
    public Action execute(Product product) {
        if (product.getProductType().equals(ProductType.BOOK)){
            return Action.DUPLICATE_PACKING_SLIP_FOR_ROYALTY;
        }
        return null;
    }
}
