package com.plateer.board.dao;

import com.plateer.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardDAO {

    public List<BoardDTO> listDAO();
    public BoardDTO viewDAO(@Param("_id") String id);
    public int writeDAO(@Param("_writer") String writer, @Param("_title") String title, @Param("_content") String content);
    public int updateDAO(@Param("_writer") String writer, @Param("_title") String title, @Param("_content") String content, @Param("_id") String id);
    public int deleteDAO(@Param("_id") String id);

}
