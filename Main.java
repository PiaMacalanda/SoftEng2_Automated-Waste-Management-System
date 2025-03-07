import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        WasteHandler organicHandler = new OrganicWasteHandler();
        WasteHandler recyclableHandler = new RecyclableWasteHandler();
        WasteHandler hazardousHandler = new HazardousWasteHandler();
        WasteHandler defaultHandler = new DefaultWasteHandler();

        organicHandler.setNextHandler(recyclableHandler);
        recyclableHandler.setNextHandler(hazardousHandler);
        hazardousHandler.setNextHandler(defaultHandler);

        WasteContainer organicWaste = new WasteContainer("organic", 50);
        WasteContainer recyclableWaste = new WasteContainer("recyclable", 30);
        WasteContainer hazardousWaste = new WasteContainer("hazardous", 10);
        WasteContainer unknownWaste = new WasteContainer("electronic", 20);

        logger.info("Starting waste processing...");
        organicHandler.handleRequest(organicWaste);
        organicHandler.handleRequest(recyclableWaste);
        organicHandler.handleRequest(hazardousWaste);
        organicHandler.handleRequest(unknownWaste);
        logger.info("Waste processing complete.");
    }
}
