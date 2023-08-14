package com.yeoboge.server.repository;

import com.yeoboge.server.domain.dto.friend.FriendInfoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 친구 관련 {@code QueryDsl} 쿼리를 정의하는 인터페이스
 */
public interface FriendRepository {
    /**
     * 친구 목록을 페이징을 적용해 조회함.
     *
     * @param id 조회할 회원 ID
     * @param pageable 페이징 정보가 담긴 {@link Pageable}
     * @return 페이징된 친구 {@link FriendInfoDto} 목록
     */
    Page<FriendInfoDto> getFriendsPage(final Long id, final Pageable pageable);

    /**
     * 친구 요청 목록을 페이징을 적용해 조회함.
     *
     * @param id 조회할 회원 ID
     * @param pageable 페이징 정보가 담긴 {@link Pageable}
     * @return 페이징된 친구 요청한 사용자의 {@link FriendInfoDto} 목록
     */
    Page<FriendInfoDto> getFriendRequestsPage(final Long id, final Pageable pageable);
}
