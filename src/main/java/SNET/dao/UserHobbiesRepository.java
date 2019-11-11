package SNET.dao;

import java.util.List;

import SNET.annotation.Benchmark;
import org.springframework.data.jpa.repository.JpaRepository;

import SNET.domain.entity.Hobby;
import SNET.domain.entity.UserHobby;
@Benchmark
public interface UserHobbiesRepository extends JpaRepository<UserHobby, Long>{
	List<UserHobby> findByHobby(Hobby hobby);
}
