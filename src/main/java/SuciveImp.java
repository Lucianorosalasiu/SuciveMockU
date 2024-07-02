import jakarta.jws.WebService;



@WebService
public class SuciveImp implements Sucive{
    public String SubmitPayment(String LiscensePlate, Double Amount){
       if( Math.random() < 0.5 ) {
           return "SUCIVE payment done succesfully";
       }else{
           return "Something went really wrong with your payment";
       }
    }
}
