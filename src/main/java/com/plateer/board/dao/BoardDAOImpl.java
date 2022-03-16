package com.plateer.board.dao;

import com.plateer.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{

    @Autowired
    JdbcTemplate template;

    @Override
    public List<BoardDTO> listDAO() {
        System.out.println("listDAO()");

        String query = "SELECT * FROM board ORDER BY id DESC";

        List<BoardDTO> dto = template.query(query, new BeanPropertyRowMapper<BoardDTO>(BoardDTO.class));
        return dto;
    }

    @Override
    public BoardDTO viewDAO(String id) {
        System.out.println("viewDAO()");

        String query = "SELECT * FROM board WHERE id = " + id;
        BoardDTO dto = template.queryForObject(query, new BeanPropertyRowMapper<BoardDTO>(BoardDTO.class));
        return dto;
    }

    @Override
    public int writeDAO(String writer, String title, String content) {
        System.out.println("writeDAO()");

        String query = "INSERT INTO board (id, writer, title, content)" +
                       "VALUES (default, ?, ?, ?)";
        return template.update(query, writer, title, content);
    }

    @Override
    public int updateDAO(String writer, String title, String content, final String id) {
        System.out.println("updateDAO()");

        String query = "UPDATE board SET writer = ?, title = ?, content = ? WHERE id = ?";
        return template.update(query, writer, title, content, Integer.parseInt(id));
    }

    @Override
    public int deleteDAO(final String id) {
        System.out.println("deleteDAO()");

        String query = "DELETE FROM board WHERE id = ?";
        return template.update(query, Integer.parseInt(id));
    }
}
