package rule;

import model.Action;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;

public class VideoRule implements IBusinessRule{
    @Override
    public List<Action> execute(Product product) {
        List<Action> actions = new ArrayList<>();
        if (product.getProductType().equals(ProductType.VIDEO)){
            if (product.getProductName().equals("Learning to Ski")){
                actions.add(Action.ADD_FREE_FIRST_AID_VIDEO);
            }
        }
        return actions;
    }
}
