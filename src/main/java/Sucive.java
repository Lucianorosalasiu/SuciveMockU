import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.servlet.annotation.WebServlet;

@WebService

public interface Sucive {
    @WebMethod
    String SubmitPayment(String LiscensePlate, Double Amount);
}
