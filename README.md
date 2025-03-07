# Automated Waste Management System

## Background
Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.

## Objective
Develop an automated waste management system that uses the **Chain of Responsibility** pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.

## Features
- **Waste Container Class**: Represents waste containers with specific capacity and type (organic, recyclable, hazardous, etc.).
- **Waste Collection Chain**: Implements a **Chain of Responsibility Pattern** to handle different waste types.
- **Automated Waste Processing**:
  - Initializes a chain of waste collectors.
  - Detects when a waste container is full or needs disposal.
  - Passes the request through the chain until the appropriate handler processes it.
- **Validation**: Ensures that waste containers are correctly identified and disposed of by the appropriate waste collector.

## Design Pattern Used: Chain of Responsibility
Each type of waste has a dedicated handler that processes the waste if it matches its category. Otherwise, it passes the request to the next handler in the chain.
![Image](https://github.com/user-attachments/assets/02e00b85-5161-4a48-a1ed-0b25bfe59c07)

## Code Overview
- `WasteContainer.java`: Defines the waste container attributes (`type` and `capacity`).
- `WasteHandler.java`: Abstract handler class with a `handleRequest` method and a reference to the next handler.
- `OrganicWasteHandler.java`: Processes organic waste.
- `RecyclableWasteHandler.java`: Processes recyclable waste.
- `HazardousWasteHandler.java`: Processes hazardous waste.
- `DefaultWasteHandler.java`: Handles unknown waste types.
- `Main.java`: Initializes the handler chain and processes waste disposal requests.

## Example Output
```
INFO: Starting waste processing...
Processing organic waste disposal for container with capacity: 50
Processing recyclable waste disposal for container with capacity: 30
Processing hazardous waste disposal for container with capacity: 10
Redirecting unknown waste type ('electronic') to manual processing.
INFO: Waste processing complete.
```
