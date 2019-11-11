package SNET.dao;

import java.util.List;

import SNET.annotation.Benchmark;
import org.springframework.data.jpa.repository.JpaRepository;

import SNET.domain.entity.Tags;
import SNET.domain.entity.TagsNews;
@Benchmark
public interface TagsNewsRepository extends JpaRepository<TagsNews, Long>{
	List<TagsNews> findByTag(Tags Id);
}
