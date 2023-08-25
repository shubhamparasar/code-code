import com.practice.designpatterns.factory.models.Address;
import com.practice.designpatterns.factory.models.Country;
import com.practice.designpatterns.factory.validators.ValidatorFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Address address = new Address();
        ValidatorFactory.getInstance().getValidator(Country.India).validate(address);
        ValidatorFactory.getInstance().getValidator(Country.USA).validate(address);
        ValidatorFactory.getInstance().getValidator(Country.Germany).validate(address);


    }
}