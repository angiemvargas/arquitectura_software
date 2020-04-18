package co.edu.udea.api;

import co.edu.udea.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(value = "/contact")
    public Contact getContact() {
        return new Contact(1026L, "Angie", "Vargas", "3157901275", "angiem.vargas@udea.edu.co");
    }
}
