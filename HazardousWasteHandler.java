class HazardousWasteHandler extends WasteHandler {
    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Processing hazardous waste disposal for container with capacity: " + container.getCapacity());
        } else {
            super.handleRequest(container);
        }
    }
}