package model;

public enum Action {

    GENERATE_PACKING_SLIP_FOR_SHIPPING(1, "Generate a packing slip for shipping"),
    DUPLICATE_PACKING_SLIP_FOR_ROYALTY(2,"Duplicate packing slip for the royalty department"),
    ACTIVATE_MEMBERSHIP(3, "Activate Membership"),
    APPLY_UPGRADE_TO_MEMBERSHIP(4, "Apply Upgrade to Membership"),
    ADD_FREE_FIRST_AID_VIDEO(5, "add a free “First Aid” video to the packing slip"),
    GENERATE_A_PAY_COMMISSION(6,"generate a commission payment to the agent"),
    SEND_EMAIL_TO_OWNER(7, "Email the owner and inform them of the activation/upgrade");

    Action(int actionId, String actionName) {
        this.actionId = actionId;
        this.actionName = actionName;
    }

    private int actionId;
    private String actionName;
}
