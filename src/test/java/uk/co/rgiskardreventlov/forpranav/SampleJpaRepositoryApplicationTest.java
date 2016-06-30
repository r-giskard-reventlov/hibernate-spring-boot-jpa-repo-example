package uk.co.rgiskardreventlov.forpranav;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.co.rgiskardreventlov.forpranav.model.User;
import uk.co.rgiskardreventlov.forpranav.repository.UserRepository;

import java.util.List;

/**
 * Created by rgiskard on 30/06/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SampleJpaRepositoryApplication.class)
public class SampleJpaRepositoryApplicationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testJpsRepo() throws Exception {
        User u = new User("justin", "wilson", "my-fake-email@gmail.com", "1234567890");
        userRepository.save(u);
        List<User> savedUser = userRepository.findAll();
        savedUser.stream().forEach(System.out::println);
    }

}