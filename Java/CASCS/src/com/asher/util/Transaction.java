package com.asher.util;

public interface Transaction {
	void beginTransaction();
	void commit();
	void rollback();
}
