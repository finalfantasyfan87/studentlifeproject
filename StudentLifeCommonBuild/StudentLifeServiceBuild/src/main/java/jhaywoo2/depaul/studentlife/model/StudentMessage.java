package jhaywoo2.depaul.studentlife.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "messages")
public class StudentMessage {
    @Id
private String messageId;


private String messageRecipient;

private String message;

        public StudentMessage() {
        }

        public StudentMessage(String messageRecipient, String message) {
            this.messageRecipient = messageRecipient;
            this.message = message;
        }


        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }

        public String getMessageRecipient() {
            return messageRecipient;
        }

        public void setMessageRecipient(String messageRecipient) {
            this.messageRecipient = messageRecipient;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentMessage{");
        sb.append("messageId='").append(messageId).append('\'');
        sb.append(", messageRecipient='").append(messageRecipient).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
