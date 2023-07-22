package com.yeoboge.server.repository;

import com.yeoboge.server.domain.entity.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository {
    void save(final RefreshToken refreshToken);
    void delete(final String accessToken);
    Optional<RefreshToken> findIdByToken(final String refreshToken);
}
