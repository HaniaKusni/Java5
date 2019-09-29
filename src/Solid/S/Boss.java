package Solid.S;

public class Boss extends Manager{

    private boolean isBoss;

    public Boss(boolean isBoss, boolean isManager) {
        super(isManager);
        this.isBoss = isBoss;

    }
}
