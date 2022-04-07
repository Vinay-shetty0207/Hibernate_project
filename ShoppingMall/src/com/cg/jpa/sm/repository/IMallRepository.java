package com.cg.jpa.sm.repository;

import com.cg.jpa.sm.entities.Mall;

public interface IMallRepository {
public Mall addMall(Mall mall);
public Mall updateMall(Mall mall);
public Mall searchMall(long id);

public abstract void beginTransaction();
public abstract void commitTransaction();
}
