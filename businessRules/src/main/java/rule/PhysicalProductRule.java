package rule;

import model.Action;
import model.Product;
import model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class PhysicalProductRule implements IBusinessRule{
    @Override
    public List<Action> execute(Product product) {
        List<Action> actions = new ArrayList<>();
        if (product.getProductCategory().equals(ProductCategory.PHYSICAL)){
            actions.add(Action.GENERATE_PACKING_SLIP_FOR_SHIPPING);
            actions.add(Action.GENERATE_A_PAY_COMMISSION);
        }
        return actions;
    }
}
