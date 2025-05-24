public class CEO extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("high")) {
            System.out.println("CEO handled high-level request.");
        } else {
            System.out.println("Request could not be handled.");
        }
    }
}
