package service;

import model.Action;
import model.Product;
import rule.*;

import java.util.ArrayList;
import java.util.List;

public class ActionDeterminerService {

    List<IBusinessRule> rules = new ArrayList<>();

    public ActionDeterminerService() {
        rules.add(new PhysicalProductRule());
        rules.add(new NonPhysicalProductRule());
        rules.add(new BookRule());
        rules.add(new MembershipRule());
        rules.add(new UpgradeMembershipRule());
        rules.add(new VideoRule());
    }

    public List<Action> findTheActionsForProduct(Product product){
        List<Action> actions = new ArrayList<>();
        for (IBusinessRule rule : rules) {
            actions.addAll(rule.execute(product));
        }
        return actions;
    }
}
