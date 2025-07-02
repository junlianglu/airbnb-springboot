package com.github.junlianglu.backend.config;

import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

@Configuration
public class JwtConfig {

    @Value("${jwt.secret:default_secret_key}")
    private String secret;

    private final long expirationMs = 3600000; // 1 hour

    public Key getSigningKey() {
        byte[] keyBytes = Base64.getEncoder().encode(secret.getBytes());
        return new SecretKeySpec(keyBytes, getAlgorithm().getJcaName());
    }

    public String getSecret() {
        return secret;
    }

    public long getExpirationMs() {
        return expirationMs;
    }

    public SignatureAlgorithm getAlgorithm() {
        return SignatureAlgorithm.HS256;
    }
}