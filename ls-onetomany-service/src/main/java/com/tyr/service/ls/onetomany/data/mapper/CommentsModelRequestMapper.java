package com.tyr.service.ls.onetomany.data.mapper;

import com.tyr.service.ls.onetomany.domain.dto.CommentsDTO;
import com.tyr.service.ls.onetomany.domain.model.CommentsModel;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component("commentsModelRequestMapper")
public class CommentsModelRequestMapper implements Function<CommentsDTO, CommentsModel> {

    @Override
    public CommentsModel apply(CommentsDTO commentsDTO) {
        return new CommentsModel().builder()
                .withAuthor(commentsDTO.getAutor())
                .withDescripcion(commentsDTO.getDescripcion())
                .withComentario(commentsDTO.getComentario())
                .build();
    }
}
