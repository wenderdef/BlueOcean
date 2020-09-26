package blueocean.user;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserEntity criar(String nome, String email, String senha, Date nascimento, String cep) {
		
		UserEntity user = new UserEntity();
		
		user.setNome(nome);
		user.setEmail(email);
		user.setSenha(senha);
		user.setNascimento(nascimento);
		user.setCep(cep);
		
		
        return userRepository.save(user);
    }
	
	
	
	

	public List<UserEntity> buscarTodos() {
        return userRepository.findAll();
    }
	
	public void deletarTodos() {
    	userRepository.deleteAll();
    }
	
	
	
}
