package SNET.dao;

import java.util.List;

import SNET.annotation.Benchmark;
import org.springframework.data.jpa.repository.JpaRepository;

import SNET.domain.entity.Comments;
@Benchmark
public interface CommentsRepository extends JpaRepository<Comments, Long> {
	
}
