package message;

public class Message {
    private String service;
    private String message;

    public Message() {
    }

    public Message(String service, String message) {
        this.service = service;
        this.message = message;
    }

    public String getService() {
        return service;
    }

    public String getMessage() {
        return message;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
