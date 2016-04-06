/***************************************************************************
 * 							tungtt							               *    
 **************************************************************************/
package com.chotoxautinh.server.service;

import com.chotoxautinh.server.model.QUser;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.Predicate;

/**
 * Author : tungtt Apr 5, 2016
 */
public class UserFilter {

	public static Predicate build(String id, String username, String password, String fullname) {
		BooleanBuilder builder = new BooleanBuilder();
		if (id != null && !id.isEmpty())
			builder.and(QUser.user.id.like(toAlias(id)));
		if (username != null && !username.isEmpty())
			builder.and(QUser.user.username.like(toAlias(username)));
		if (password != null && !password.isEmpty())
			builder.and(QUser.user.password.like(toAlias(password)));
		if (fullname != null && !fullname.isEmpty())
			builder.and(QUser.user.fullname.like(toAlias(fullname)));
		return builder.getValue();
	}

	private static String toAlias(String input) {
		return "%" + input + "%";
	}
}
