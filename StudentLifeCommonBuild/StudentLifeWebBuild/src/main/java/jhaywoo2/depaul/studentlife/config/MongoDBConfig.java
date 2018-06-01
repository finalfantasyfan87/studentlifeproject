package jhaywoo2.depaul.studentlife.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static java.util.Collections.singletonList;

@Configuration
@EnableMongoRepositories(basePackages = "jhaywoo2.depaul.studentlife.repository")
public class MongoDBConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "messages1";
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        //removing credentials until i figure out to do a system resource with wildfly
        //i am also do this with heroku...will figure out
        return new MongoClient(singletonList(new ServerAddress("den1.mongo1.gear.host", 27001)),
                singletonList(MongoCredential.createCredential("", "", "".toCharArray())));
    }
}
//make a message controller, when user clicks on icon
//the message controller will be invoked
// the ui userame and message will be bound to the fields