package SNET.dao;

import java.util.List;
import java.util.Set;

import SNET.annotation.Benchmark;
import org.springframework.data.jpa.repository.JpaRepository;

import SNET.domain.entity.News;
import SNET.domain.entity.Tags;
@Benchmark
public interface TagsRepository extends JpaRepository<Tags, Long>{

	Set<Tags> findByNameIn(List<String> name);

	Tags findByName(String tagsName);
	
}
