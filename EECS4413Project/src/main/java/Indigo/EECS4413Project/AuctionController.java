package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping("/auction")
public class AuctionController {
	@Autowired
	private AuctionDAO auctionDAO = new AuctionDAO(); 

	@PostMapping("/")
	@ResponseBody
	public Auction startauction(HttpSession session) {
		return auctionDAO.start(session);
	}
}
