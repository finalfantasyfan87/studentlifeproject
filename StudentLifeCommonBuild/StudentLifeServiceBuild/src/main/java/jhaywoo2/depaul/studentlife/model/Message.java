package jhaywoo2.depaul.studentlife.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class Message {
private String messageId;
private String userName;
private String message;

        public Message() {
        }

        public Message(String userName, String message) {
            this.userName = userName;
            this.message = message;
        }


        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
}
