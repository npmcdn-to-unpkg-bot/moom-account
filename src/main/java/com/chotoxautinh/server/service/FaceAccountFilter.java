/***************************************************************************
 * 							tungtt							               *    
 **************************************************************************/
package com.chotoxautinh.server.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.chotoxautinh.server.dao.GroupDao;
import com.chotoxautinh.server.model.Group;
import com.chotoxautinh.server.model.QFaceAccount;
import com.chotoxautinh.server.model.QGroup;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.Predicate;

/**
 * Author : tungtt Mar 28, 2016
 */
public class FaceAccountFilter {
	private BooleanBuilder builder = new BooleanBuilder();

	@Autowired
	private GroupDao groupDao;

	private static final int NONE = -2;
	private static final int HAVE = -1;

	public FaceAccountFilter(String id, String email, String password, String phone, Integer group, String groupName) {
		if (id != null && !id.isEmpty())
			builder.and(QFaceAccount.faceAccount.id.like(toAlias(id)));
		if (email != null && !email.isEmpty())
			builder.and(QFaceAccount.faceAccount.email.like(toAlias(email)));
		if (password != null && !password.isEmpty())
			builder.and(QFaceAccount.faceAccount.password.like(toAlias(password)));
		if (phone != null && !phone.isEmpty())
			builder.and(QFaceAccount.faceAccount.phone.like(toAlias(phone)));
		if (group != null) {
			List<String> allGroupId = groupDao.findAllGroups().stream().map(Group::getId).collect(Collectors.toList());
			switch (group) {
			case NONE:
				builder.and(QFaceAccount.faceAccount.group.notIn(allGroupId));
				break;
			case HAVE:
				builder.and(QFaceAccount.faceAccount.group.in(allGroupId));
				break;
			default:
				builder.and(QFaceAccount.faceAccount.group.eq(String.valueOf(group)));
				break;
			}
		}
		if (groupName != null && !groupName.isEmpty()){
			Predicate predicate = QGroup.group.name.like(toAlias(groupName));
			List<String> allGroupId = groupDao.findAllGroups(predicate).stream().map(Group::getId).collect(Collectors.toList());
			builder.and(QFaceAccount.faceAccount.group.in(allGroupId));
		}
	}

	public Predicate getPredicate() {
		return builder.getValue();
	}

	private String toAlias(String input) {
		return "%" + input + "%";
	}

	public FaceAccountFilter(String group) {
		if (group != null && !group.isEmpty())
			builder.and(QFaceAccount.faceAccount.group.eq(group));
	}

	public FaceAccountFilter(String id, String email, String password, String phone) {
		if (id != null && !id.isEmpty())
			builder.and(QFaceAccount.faceAccount.id.like(toAlias(id)));
		if (email != null && !email.isEmpty())
			builder.and(QFaceAccount.faceAccount.email.like(toAlias(email)));
		if (password != null && !password.isEmpty())
			builder.and(QFaceAccount.faceAccount.password.like(toAlias(password)));
		if (phone != null && !phone.isEmpty())
			builder.and(QFaceAccount.faceAccount.phone.like(toAlias(phone)));
	}
}
