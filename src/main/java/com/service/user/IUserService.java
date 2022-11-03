package com.service.user;

import com.model.User;
import com.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;
//Interface IUserService kế thừa interface UserDetailsService có sẵn của Spring
// (lớp chứa phương thức load tất cả user từ trong database bằng username)
public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
