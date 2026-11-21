public class ApiStatusValidator {
    public static void main(String[] args){
        int expectedStatusCode = 200;
        int actualStatusCode = 200;
        long responseTimeMs = 1450L;
        long maxAllowedTimeMs = 2000L;
        boolean isApiHealthy = (actualStatusCode==expectedStatusCode) && (responseTimeMs<maxAllowedTimeMs);
        System.out.println("Expected StatusCode:" + expectedStatusCode);
        System.out.println("Actual StatusCode: " + actualStatusCode);
        System.out.println("Did Api is Healthy? "+ isApiHealthy);
    }
}
