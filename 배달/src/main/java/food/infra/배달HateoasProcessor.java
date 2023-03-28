package food.infra;

import food.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 배달HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<배달>> {

    @Override
    public EntityModel<배달> process(EntityModel<배달> model) {
        return model;
    }
}
