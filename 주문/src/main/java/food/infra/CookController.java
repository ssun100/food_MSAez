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
// @RequestMapping(value="/cooks")
@Transactional
public class CookController {

    @Autowired
    CookRepository cookRepository;

    @RequestMapping(
        value = "cooks/{id}/수락여부결정",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Cook 수락여부결정(
        @PathVariable(value = "id") Long id,
        @RequestBody 수락여부결정Command 수락여부결정Command,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /cook/수락여부결정  called #####");
        Optional<Cook> optionalCook = cookRepository.findById(id);

        optionalCook.orElseThrow(() -> new Exception("No Entity Found"));
        Cook cook = optionalCook.get();
        cook.수락여부결정(수락여부결정Command);

        cookRepository.save(cook);
        return cook;
    }

    @RequestMapping(
        value = "cooks/{id}/요리시작",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Cook 요리시작(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /cook/요리시작  called #####");
        Optional<Cook> optionalCook = cookRepository.findById(id);

        optionalCook.orElseThrow(() -> new Exception("No Entity Found"));
        Cook cook = optionalCook.get();
        cook.요리시작();

        cookRepository.save(cook);
        return cook;
    }

    @RequestMapping(
        value = "cooks/{id}/요리완료",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Cook 요리완료(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /cook/요리완료  called #####");
        Optional<Cook> optionalCook = cookRepository.findById(id);

        optionalCook.orElseThrow(() -> new Exception("No Entity Found"));
        Cook cook = optionalCook.get();
        cook.요리완료();

        cookRepository.save(cook);
        return cook;
    }
}
