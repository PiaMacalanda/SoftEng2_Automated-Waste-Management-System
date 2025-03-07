class RecyclableWasteHandler extends WasteHandler {
    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Processing recyclable waste disposal for container with capacity: " + container.getCapacity());
        } else {
            super.handleRequest(container);
        }
    }
}