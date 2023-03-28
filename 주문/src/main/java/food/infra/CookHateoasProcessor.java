package food.infra;

import food.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CookHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cook>> {

    @Override
    public EntityModel<Cook> process(EntityModel<Cook> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/수락여부결정")
                .withRel("수락여부결정")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/요리시작")
                .withRel("요리시작")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/요리완료")
                .withRel("요리완료")
        );

        return model;
    }
}
