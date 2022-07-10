package kr.co.communityJh.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import kr.co.communityJh.entity.Account;
import lombok.Getter;
import lombok.ToString;

/**
 * @author jhlee
 * 
 * Account Entity에 매핑되는 Login AcountDTO
 * 
 */
@Getter
public class AccountAuthDTO extends User {
	
	private AccountRequestDTO accountRequestDTO;
	
	public AccountAuthDTO(Account account, Collection<GrantedAuthority> authorities) {
		super(account.getEmail(), account.getPassword(), authorities);
		this.accountRequestDTO = account.toAccountDTO();
	}


	
}