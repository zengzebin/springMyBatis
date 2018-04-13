package com.zzb.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zzb.service3.BookMapperService;
import com.zzb.service3.BookMapperService2;
import com.zzb.xml.Book;

import tk.mybatis.mapper.entity.Example;

@Controller
@RequestMapping("/test")
public class Test {

	// @Autowired
	// private UserService userService;

	/*
	 * @Autowired BookService bookService;
	 * 
	 * @Autowired OrderService orderService;
	 */

	// @RequestMapping("/getAllUser")
	// public void getAllUser(HttpServletRequest request) {
	// userService.getUser();
	//
	// }
	@Autowired
	BookMapperService bookMapperService;

	@Autowired
	BookMapperService2 bookMapperService2;

	// @RequestMapping("/getBookListg")
	// public void getBookListg(HttpServletRequest request) {
	// PageInfo<Book> list = bookService.queryByPage(1, 2);
	//
	// for (int i = 0; i < list.getList().size(); i++) {
	// Book b = list.getList().get(i);
	// System.out.println(b.getTitle());
	// }
	// }

	// @RequestMapping("/order")
	// public void getOrdersCustom(HttpServletRequest request) {
	// PageInfo<OrdersCustom> list = orderService.queryByPage(1, 2);
	//
	// System.out.println("ok");
	//
	// }

	@RequestMapping("/book")
	public void book(HttpServletRequest request) {
		Book Book = bookMapperService.getBookById(1);

		Example example = new Example(Book.class);
		example.createCriteria().andCondition("id=", 1);
		List<Book> list = bookMapperService.selectByExample(example);
		// Book insert = new Book();
		// insert.setTitle("曾泽彬");
		// insert.setPrice(23.2);
		// bookMapperService.insert(insert);
		// System.out.println(insert.getId());

	}

}
