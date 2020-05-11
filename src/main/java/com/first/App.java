package com.first;

public class App {

    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1", "Alex Gri");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Some Log Event for example");
    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
