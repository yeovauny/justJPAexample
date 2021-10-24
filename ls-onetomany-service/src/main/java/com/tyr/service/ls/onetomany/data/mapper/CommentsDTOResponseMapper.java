package com.tyr.service.ls.onetomany.data.mapper;

import com.tyr.service.ls.onetomany.domain.dto.CommentsDTO;
import com.tyr.service.ls.onetomany.domain.model.CommentsModel;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("commentsDTOResponseMapper")
public class CommentsDTOResponseMapper implements Function<CommentsModel,CommentsDTO> {

    @Override
    public CommentsDTO apply(CommentsModel commentsModel) {
        return new CommentsDTO().builder()
                .withAutor(commentsModel.getAutor())
                .withDescription(commentsModel.getDescripcion())
                .andComentario(commentsModel.getComentario())
                .build();
    }
}
