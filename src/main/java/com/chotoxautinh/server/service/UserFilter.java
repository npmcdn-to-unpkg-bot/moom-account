/***************************************************************************
 * 							tungtt							               *    
 **************************************************************************/
package com.chotoxautinh.server.service;

import javax.annotation.PostConstruct;

import com.chotoxautinh.server.model.QUser;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.Predicate;

/**
 * Author : tungtt Apr 5, 2016
 */
public class UserFilter {
	private BooleanBuilder builder = new BooleanBuilder();

	@PostConstruct
	public void build(String id, String username, String password, String fullname) {
		if (id != null && !id.isEmpty())
			builder.and(QUser.user.id.like(toAlias(id)));
		if (username != null && !username.isEmpty())
			builder.and(QUser.user.username.like(toAlias(username)));
		if (password != null && !password.isEmpty())
			builder.and(QUser.user.password.like(toAlias(password)));
		if (fullname != null && !fullname.isEmpty())
			builder.and(QUser.user.fullname.like(toAlias(fullname)));
	}

	public Predicate getPredicate() {
		return builder.getValue();
	}

	private static String toAlias(String input) {
		return "%" + input + "%";
	}
}
