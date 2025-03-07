abstract class WasteHandler {
    protected WasteHandler nextHandler;

    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(WasteContainer container) {
        if (nextHandler != null) {
            nextHandler.handleRequest(container);
        } else {
            System.out.println("No handler available for waste type: " + container.getType());
        }
    }
}