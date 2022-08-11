package br.com.iteris.domain.dtos;

public class TokenResponse {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenResponse(String token) {
        this.token = token;
    }

    public TokenResponse() {
    }
}
