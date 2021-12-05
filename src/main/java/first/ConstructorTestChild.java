package first;

public class ConstructorTestChild extends ConstructorTestParent{
    public ConstructorTestParent getInstance(){
        return new ConstructorTestChild();
    }
}
