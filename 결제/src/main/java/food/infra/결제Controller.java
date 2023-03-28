package food.infra;

import food.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/결제")
@Transactional
public class 결제Controller {

    @Autowired
    결제Repository 결제Repository;

    @RequestMapping(
        value = "결제/{id}/취소",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public 결제 취소(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /결제/취소  called #####");
        Optional<결제> optional결제 = 결제Repository.findById(id);

        optional결제.orElseThrow(() -> new Exception("No Entity Found"));
        결제 결제 = optional결제.get();
        결제.취소();

        결제Repository.save(결제);
        return 결제;
    }
}
