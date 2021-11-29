package service;

import model.Action;
import model.Product;
import model.ProductCategory;
import model.ProductType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ActionDeterminerServiceTest {

    private ActionDeterminerService actionDeterminerService = new ActionDeterminerService();

    @Test
    public void findTheActionsForProduct_Book() {
        Product book = new Product(1, ProductCategory.PHYSICAL, ProductType.BOOK,"ABC",100);
        List<Action> expectedActions = new ArrayList<>();
        expectedActions.add(Action.GENERATE_PACKING_SLIP_FOR_SHIPPING);
        expectedActions.add(Action.GENERATE_A_PAY_COMMISSION);
        expectedActions.add(Action.DUPLICATE_PACKING_SLIP_FOR_ROYALTY);
        List<Action> theActionsForProduct = actionDeterminerService.findTheActionsForProduct(book);
        Assertions.assertEquals(3,theActionsForProduct.size());
        Assertions.assertEquals(expectedActions,theActionsForProduct);
    }

    @Test
    public void findTheActionsForProduct_Membership() {
        Product membership = new Product(1, ProductCategory.NONPHYSICAL, ProductType.MEMBERSHIP,"Membership",100);
        List<Action> expectedActions = new ArrayList<>();
        expectedActions.add(Action.SEND_EMAIL_TO_OWNER);
        expectedActions.add(Action.ACTIVATE_MEMBERSHIP);
        List<Action> theActionsForProduct = actionDeterminerService.findTheActionsForProduct(membership);
        Assertions.assertEquals(2,theActionsForProduct.size());
        Assertions.assertEquals(expectedActions,theActionsForProduct);
    }

    @Test
    public void findTheActionsForProduct_UpgradeMembership() {
        Product membership = new Product(1, ProductCategory.NONPHYSICAL, ProductType.MEMBERSHIP_UPGRADE,"Membership",100);
        List<Action> expectedActions = new ArrayList<>();
        expectedActions.add(Action.SEND_EMAIL_TO_OWNER);
        expectedActions.add(Action.APPLY_UPGRADE_TO_MEMBERSHIP);
        List<Action> theActionsForProduct = actionDeterminerService.findTheActionsForProduct(membership);
        Assertions.assertEquals(2,theActionsForProduct.size());
        Assertions.assertEquals(expectedActions,theActionsForProduct);
    }

    @Test
    public void findTheActionsForProduct_Video() {
        Product membership = new Product(1, ProductCategory.PHYSICAL, ProductType.MEMBERSHIP_UPGRADE,"Learning to Ski",100);
        List<Action> expectedActions = new ArrayList<>();
        expectedActions.add(Action.GENERATE_PACKING_SLIP_FOR_SHIPPING);
        expectedActions.add(Action.GENERATE_A_PAY_COMMISSION);
        expectedActions.add(Action.APPLY_UPGRADE_TO_MEMBERSHIP);
        List<Action> theActionsForProduct = actionDeterminerService.findTheActionsForProduct(membership);
        Assertions.assertEquals(3,theActionsForProduct.size());
        Assertions.assertEquals(expectedActions,theActionsForProduct);
    }
}