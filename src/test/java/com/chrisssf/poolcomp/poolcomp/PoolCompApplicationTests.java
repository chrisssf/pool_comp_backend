package com.chrisssf.poolcomp.poolcomp;

import com.chrisssf.poolcomp.poolcomp.models.Comp;
import com.chrisssf.poolcomp.poolcomp.models.Player;
import com.chrisssf.poolcomp.poolcomp.repositories.CompRepository;
import com.chrisssf.poolcomp.poolcomp.repositories.PlayerRepository;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PoolCompApplicationTests {

	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	CompRepository compRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void	createPlayer(){
		Player chris = new Player("Chris", "Fraser", "Spanish");
		playerRepository.save(chris);

		List<Player> thing = new ArrayList<Player>();
		thing.add(chris);
		Comp comp1 = new Comp(thing, 25, 3, 2, 1);
		compRepository.save(comp1);
	}


}
