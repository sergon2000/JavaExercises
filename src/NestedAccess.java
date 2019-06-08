public class NestedAccess {

    private Inner inner = new Inner();

    public Inner getInner() {
        return inner;
    }

    public static void outerPublic() {
    }

    private static void outerPrivate() {
    }

    public static class Inner {

        public void innerPublic() {
            outerPrivate();
        }
    }
}
