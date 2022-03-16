package com.plateer.board.dao;

import com.plateer.board.dto.BoardDTO;

import java.util.List;

public interface BoardDAO {

    public List<BoardDTO> listDAO();
    public BoardDTO viewDAO(String id);
    public int writeDAO(String writer, String title, String content);
    public int updateDAO(String writer, String title, String content, String id);
    public int deleteDAO(String id);

}
