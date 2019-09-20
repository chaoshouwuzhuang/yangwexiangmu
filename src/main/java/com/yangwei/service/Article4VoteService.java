package com.yangwei.service;

import java.util.List;

import com.yangwei.entity.Article4Vote;
import com.yangwei.entity.VoteStatic;

/**
 * 
 * @author yangwei
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
