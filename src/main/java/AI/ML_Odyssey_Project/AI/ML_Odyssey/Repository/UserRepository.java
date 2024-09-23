package AI.ML_Odyssey_Project.AI.ML_Odyssey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AI.ML_Odyssey_Project.AI.ML_Odyssey.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
