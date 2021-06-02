package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Items> {
	public static final Logger LOGGER = LogManager.getLogger();

	private ItemsDAO itemsDAO;
	private Utils utils;

	// -----------//
	// CONSTRUCTOR//
	// -----------//
	public ItemController(ItemsDAO itemsDAO, Utils utils) {
		super();
		this.itemsDAO = itemsDAO;
		this.utils = utils;
	}

	@Override
	public List<Items> readAll() {
		List<Items> items = itemsDAO.readAll();
		for (Items item : items) {
			LOGGER.info(item);
		}

		return items;
	}

	@Override
	public Items create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Items update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}
