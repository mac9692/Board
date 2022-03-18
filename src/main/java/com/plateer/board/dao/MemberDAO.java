package com.plateer.board.dao;

import com.plateer.board.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface MemberDAO {

    public List<MemberDTO> memberListDAO();
    public MemberDTO memberViewDAO(@Param("_id") String id);
    public int signupDAO(@Param("_email") String email,
                         @Param("_password") String password,
                         @Param("_name") String name,
                         @Param("_authority") String authority);
}
