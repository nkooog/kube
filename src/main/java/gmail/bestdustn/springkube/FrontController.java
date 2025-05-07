package gmail.bestdustn.springkube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 테스트
@RestController
public class FrontController {

	@GetMapping("/")
	public Map<String, Object> index() {
		Map<String, Object> data = new HashMap<>();
		data.put("result", "success");

		List<Map> list = new ArrayList<>();
		Map<String, String> map1 = new HashMap<>();
		map1.put("id", "itstudy");
		map1.put("name", "yeonsu");
		list.add(map1);

		data.put("list", list);

		return data;
	}

}
