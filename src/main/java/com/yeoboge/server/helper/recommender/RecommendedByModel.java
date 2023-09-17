package com.yeoboge.server.helper.recommender;

import com.yeoboge.server.domain.vo.recommend.RecommendWebClientResponse;
import com.yeoboge.server.enums.RecommendTypes;
import com.yeoboge.server.repository.RecommendRepository;
import lombok.Builder;
import reactor.core.publisher.Mono;

public class RecommendedByModel extends RecommendedByML {
    @Builder
    public RecommendedByModel(
            RecommendRepository  repository,
            RecommendTypes type,
            Mono<RecommendWebClientResponse> mono,
            String userNickname
    ) {
        super(repository, mono, type);
        this.description = userNickname + "님만을 위한 추천 💘";
    }
}
