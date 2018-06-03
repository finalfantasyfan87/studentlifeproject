package jhaywoo2.depaul.studentlife.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.Resource;

@Configuration
@EnableMongoRepositories(basePackages = "jhaywoo2.depaul.studentlife.repository")
public class MongoDBConfig extends AbstractMongoConfiguration {

    // JBoss
    @Resource(lookup = "java:global/MyMongoClient")
    private MongoClient mongoClient;


    @Override
    protected String getDatabaseName() {

        return mongoClient.getDatabase("messages1").getName();
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
//        MongoCredential mongoDBCredential = mongoClient.getCredentialsList().get(0);
//        String user =   mongoDBCredential.getUserName();
//        char[] mongoDBPassword = mongoDBCredential.getPassword();
//        return new MongoClient(singletonList(new ServerAddress(mongoClient.getAddress().getHost())),
//                singletonList(MongoCredential.createCredential(user, getDatabaseName(), mongoDBPassword)));

        return mongoClient;
    }
}
//make a message controller, when user clicks on icon
//the message controller will be invoked
// the ui userame and message will be bound to the fields