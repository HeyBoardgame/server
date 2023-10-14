package com.yeoboge.server.repository;

import com.yeoboge.server.domain.vo.auth.Tokens;
import com.yeoboge.server.enums.error.AuthenticationErrorCode;
import com.yeoboge.server.handler.AppException;

import java.util.Optional;

/**
 * JWT 토큰 관련 Redis 스토리지 쿼리에 대한 메서드를 제공하는 인터페이스
 */
public interface TokenRepository {
    /**
     * Access Token, Refresh Token을 Redis 스토리지에 저장함.
     *
     * @param token 저장할 토큰 값을 담고 있는 {@link Tokens}
     */
    void save(final Tokens token);

    /**
     * Redis 스토리지에서 {@code accessToken}을 키로 하는 데이터를 삭제함.
     *
     * @param accessToken 삭제할 Redis 키
     */
    void delete(final String accessToken);

    /**
     * Redis 스토리지에서 {@code accessToken}을 키로 하는 Refresh Token을 조회함.
     *
     * @param accessToken 조회할 Redis 키
     * @return 해당 Access Token 값을 키로 하는 Refresh Token의 {@link Optional} 객체
     */
    Optional<String> findByToken(final String accessToken);

    void saveFcmToken(final Long id, final String token);
    void deleteFcmToken(final Long id);
    Optional<String> findFcmToken(final Long id);

    default String getByToken(final String accessToken) {
        return findByToken(accessToken)
                .orElseThrow(() -> new AppException(AuthenticationErrorCode.TOKEN_INVALID));
    }
}
