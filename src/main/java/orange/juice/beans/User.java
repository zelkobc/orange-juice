package orange.juice.beans;
import javax.persistence.*;

import org.springframework.context.annotation.Bean;
	@Entity
	@Table(name="users")
	public class User {
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", hashedPassword=" + hashedPassword + "]";
		}

		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;

		@Column
		private String username;
		
		@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		@JoinColumn
		private String hashedPassword;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getHashedPassword() {
			return hashedPassword;
		}
		
		public void setHashedPassword(String hashedPassword) {
			this.hashedPassword = hashedPassword;
		}

	}