package com.fix.dao;

import java.util.List;

import com.fix.entity.Wisdom;

/**
 * @author 86762
 * basic method : add, del, update, search, count all, find all/like, insert a list
 */
public interface DataDao {
public void addWis(Wisdom wis);
public void delWis(int i);
public void updateWis(Wisdom wis);
public Wisdom findOne(int i); 

public List finAll();//find all data
public int countTotal();//count record
public List likeQuery(String st);//like query
public void addList(List<Wisdom> wisList);//add multiple rows as a list, we don't need a return value here result in grammer
	
}
