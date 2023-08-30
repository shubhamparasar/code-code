import com.practice.designpatterns.adapter.PhonePe;
import com.practice.designpatterns.adapter.PhonePeSbiBankApi;
import com.practice.designpatterns.adapter.PhonePeYesBankApi;
import com.practice.designpatterns.builder.Student;
import com.practice.designpatterns.factory.models.Address;
import com.practice.designpatterns.factory.models.Country;
import com.practice.designpatterns.factory.validators.ValidatorFactory;
import com.practice.designpatterns.observer.EmailSender;
import com.practice.designpatterns.observer.Flipkart;
import com.practice.designpatterns.observer.MsgSender;

public class Main {
    public static void main(String[] args) {


        // Factory pattern classes being called
        System.out.println("Factory Design pattern");
        Address address = new Address();
        ValidatorFactory.getInstance().getValidator(Country.India).validate(address);
        ValidatorFactory.getInstance().getValidator(Country.USA).validate(address);
        ValidatorFactory.getInstance().getValidator(Country.Germany).validate(address);

    // Builder pattern classes being called
        System.out.println("Builder Design pattern");
        Student student1 = new Student.Builder().setBatchId(11).setBatchName("ALPHA").setName("Rohan").build();
        Student student2 = new Student.Builder().setName("Mohan").setBatchName("BETA").build();
        System.out.println("Student 1 : "+student1.toString());
        System.out.println("Student 2 : "+student2.toString());


        // Adapter pattern classes being called
        PhonePe phonePe = new PhonePe(new PhonePeYesBankApi());
        phonePe.doSomething();

        // Observer pattern classes being called
        EmailSender emailSender = new EmailSender();
        MsgSender msgSender = new MsgSender();
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.postPurchaseActions();


    }
}