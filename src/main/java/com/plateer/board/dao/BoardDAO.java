package com.plateer.board.dao;

import com.plateer.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {

    public List<BoardDTO> listDAO();
    public BoardDTO viewDAO(String id);
    public int writeDAO(String writer, String title, String content);
    public int updateDAO(String writer, String title, String content, String id);
    public int deleteDAO(String id);

}
