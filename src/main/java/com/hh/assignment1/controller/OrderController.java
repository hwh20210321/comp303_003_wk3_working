package com.hh.assignment1.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hh.assignment1.model.Order;

public class OrderController {
	@RequestMapping("/phonewebform")
	public String PhoneOrder(@ModelAttribute(name="phoneform") Order order, Model m) {
		//Get the input values from the index page
		String firstName=order.getFirstName();
		String middleName=order.getMiddleName();
		String lastName=order.getLastName();
		String email=order.getEmail();
		String contactNo=order.getContactNo();
		String streetNo=order.getStreetNo();
		String streetAddressLine2=order.getStreetAddressLine2();
		String city=order.getCity();
		String province=order.getProvince();
		String postalCode=order.getPostalCode();
		String product=order.getProduct();
		String phoneBrand=order.getPhoneBrand();
		String phoneModel=order.getPhoneModel();
		String quantity=order.getQuantity();
		//...
		//do for all the attributes.. and then connect with appropriate page to load.. success
		return null;
	}
}
