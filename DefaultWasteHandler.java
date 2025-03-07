class DefaultWasteHandler extends WasteHandler {
    public void handleRequest(WasteContainer container) {
        System.out.println("Redirecting unknown waste type ('" + container.getType() + "') to manual processing.");
    }
}
