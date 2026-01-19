package com.ishan.design_patterns.creational.builder.usecase.databaseconnection;

public class DatabaseConfiguration {

    private final String databaseUrl;
    private final String username;
    private final String password;
    private final int maxConnections;
    private final boolean enableCache;
    private final boolean isReadOnly;

    private DatabaseConfiguration(Builder builder) {
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.enableCache = builder.enableCache;
        this.isReadOnly = builder.isReadOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {

        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public Builder withDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public Builder withCredentials(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public Builder withMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder withEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public Builder withReadOnly(boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            return this;
        }

        public DatabaseConfiguration build() {
            return new DatabaseConfiguration(this);
        }
    }

    @Override
    public String toString() {
        return "DatabaseConfiguration{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maxConnections=" + maxConnections +
                ", enableCache=" + enableCache +
                ", isReadOnly=" + isReadOnly +
                '}';
    }

    public static void main(String[] args) {
        DatabaseConfiguration config = DatabaseConfiguration.builder()
                .withDatabaseUrl("jdbc:mysql://localhost:3306/app_db")
                .withCredentials("root", "password")
                .withMaxConnections(20)
                .withEnableCache(true)
                .withReadOnly(false)
                .build();

        System.out.println(config);
    }
}
