import java.util.List;

import com.courtCalendarManagement.courtCalendarManagement.Entitys.UserEntity;


public interface User {
    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUser();
    UserEntity getUserById(UserEntity id);
    UserEntity getUserByEmail(UserEntity email);
    void deleteUserById(UserEntity id);
    UserEntity updateUser(int id, UserEntity user);
}
