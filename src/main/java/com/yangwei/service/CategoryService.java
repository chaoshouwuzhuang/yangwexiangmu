package com.yangwei.service;

import java.util.List;

import com.yangwei.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
