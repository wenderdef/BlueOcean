package blueocean.user;

import java.util.List;

import javax.persistence.PostPersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;

@Controller
public class UserController {

	@Autowired
	private UserService userService;


  @PostPersist
  @JsonPath("/cadastrarEstado")
  public void cadastrarNovoEstado(@Validated  UserDto userdto) {
	  userService.criar(userdto.getNome(),userdto.getEmail(),userdto.getSenha(),userdto.getNascimento(),userdto.getCep());
  } 


	
	
}
