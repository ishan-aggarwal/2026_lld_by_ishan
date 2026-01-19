package com.ishan.design_patterns.creational.builder.usecase.message;

public class MessageBuilder {

    private final MessageType messageType;
    private final String content;
    private final String sender;
    private final String recipient;
    private final boolean isDelivered;
    private final long timestamp;

    private MessageBuilder(Builder builder) {
        this.messageType = builder.messageType;
        this.content = builder.content;
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public Builder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder setIsDelivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            return this;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "MessageBuilder{" +
                "messageType=" + messageType +
                ", content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", isDelivered=" + isDelivered +
                ", timestamp=" + timestamp +
                '}';
    }

    public static void main(String[] args) {
        MessageBuilder emailMessage = MessageBuilder.getBuilder()
                .setMessageType(MessageType.EMAIL)
                .setContent("Your order has been shipped.")
                .setSender("noreply@shop.com")
                .setRecipient("user@gmail.com")
                .setIsDelivered(true)
                .setTimestamp(System.currentTimeMillis())
                .build();
        System.out.println(emailMessage);
    }
}
