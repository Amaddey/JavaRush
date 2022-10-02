public class Mouse  implements CompItem {
    @Override
    public String getName() {
        return new Mouse().getClass().getSimpleName();
    }
}
