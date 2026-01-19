package com.ishan.design_patterns.creational.builder.usecase.http;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final String body;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {

        private String url;
        private String method;
        private Map<String, String> headers;
        private String body;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder header(String key, String value) {
            if (this.headers == null) {
                this.headers = new HashMap<>();
            }
            this.headers.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            // Validate required fields
            if (this.url == null) {
                throw new IllegalStateException("URL is required");
            }
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HttpRequest request =
                HttpRequest.getBuilder()
                        .url("https://api.example.com")
                        .method("POST")
                        .header("Content-Type", "application/json")
                        .body("{\"key\": \"value\"}")
                        .build();

        System.out.println(request);
    }
}