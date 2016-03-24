/**
 * @author chotoxautinh
 *
 * Mar 23, 2016 - http://chotoxautinh.com/
 */
package com.chotoxautinh.server.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.chotoxautinh.server.model.FaceAccount;
import com.chotoxautinh.server.model.Group;
import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;

public interface FaceAccountDao {
	FaceAccount addFaceAccount(FaceAccount faccount);

	FaceAccount updateFaceAccount(FaceAccount faccount);
	
	FaceAccount addFaceAccountToGroup(FaceAccount faccount, String groupId);
	
	FaceAccount addFaceAccountToGroup(FaceAccount faccount, Group group);
	
	void removeFaceAccount(String id);
	
	void removeFaceAccount(FaceAccount faccount);

	FaceAccount findFaceAccountById(String id);

	FaceAccount findFaceAccount(Predicate predicate);

	List<FaceAccount> findAllFaceAccounts();
	
	Iterable<FaceAccount> findAllFaceAccounts(Predicate predicate);
	
	Iterable<FaceAccount> findAllFaceAccounts(Predicate predicate, OrderSpecifier<?>... orders);
	
	Page<FaceAccount> findFaceAccountsByPage(Pageable page);

	Page<FaceAccount> findFaceAccountsByPage(Predicate predicate, Pageable page);
}
