package com.service.role;

import com.model.Role;
import com.service.IGeneralService;

//IRoleService kế thừa interface IGeneralService có những phương thức lấy ra tất cả danh sách và thêm, sửa xoá cơ bản
public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}

