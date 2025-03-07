class OrganicWasteHandler extends WasteHandler {
    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Processing organic waste disposal for container with capacity: " + container.getCapacity());
        } else {
            super.handleRequest(container);
        }
    }
}
