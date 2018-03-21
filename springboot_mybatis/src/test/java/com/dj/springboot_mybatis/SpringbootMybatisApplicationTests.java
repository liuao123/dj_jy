package com.dj.springboot_mybatis;

import com.dj.springboot_mybatis.domain.Ordera;
import com.dj.springboot_mybatis.domain.Product;
import com.dj.springboot_mybatis.domain.User;
import com.dj.springboot_mybatis.service.OrderaService;
import com.dj.springboot_mybatis.service.ProductService;
import com.dj.springboot_mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	UserService userService;

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderaService orderaService;

	@Test
	public void findUser() {
		List<User> userList = userService.findUser();
		for (User u : userList){
			System.out.println(u.getId() + "===" + u.getName());
		}
	}

	@Test
	public void addUser(){
		User u = new User();
		u.setName("ls");
		userService.addUser(u);
	}

	@Test
	public void deleteUser(){
		userService.deleteUser(2);
	}

	@Test
	public void findUserById(){
		/*User u =  new User();
		u.setId(1);*/
		userService.findUserById(1);
	}

	@Test
	public void updateTest() {
		User u = new User();
		u.setId(1);
		u.setName("ls");
		userService.updateUser(u);
	}

	@Test
	public void findPro(){
		List<Product> pro = productService.findPro();
		for (Product product: pro) {
			System.out.println(product.getPrice() + "===" + product.getDesc());
		}
	}

	@Test
	public void addPro(){
		Product pro = new Product();
		pro.setProductName("aaa");
		productService.addPro(pro);
	}

	@Test
	public void deletePro(){
		productService.deletePro(3);
	}

	@Test
	public void updatePro() {
		Product pro = new Product();
		pro.setProductId(1);
		pro.setProductName("华为荣耀");
		productService.updatePro(pro);
	}

	@Test
	public void findOrdera(){
		List<Ordera> ordera = orderaService.findOrdera();

		for (Ordera ord: ordera) {
			System.out.println(ord.getId() + "===" + ord.getPrice());
		}
	}

	@Test
	public void addOrder(){
		Ordera ord = new Ordera();
		ord.setPrice(22);
		orderaService.addOrder(ord);
	}

	@Test
	public void deleteOrder(){
		orderaService.deleteOrder(2);
	}

	@Test
	public void updateOrder() {
		Ordera ord = new Ordera();
		ord.setId(1);
		ord.setPrice(15);
		orderaService.updateOrder(ord);
	}
}
