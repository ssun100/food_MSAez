package food.infra;

import food.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 결제HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<결제>> {

    @Override
    public EntityModel<결제> process(EntityModel<결제> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/취소")
                .withRel("취소")
        );

        return model;
    }
}
