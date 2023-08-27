package repository;

import org.hibernate.Session;

import entity.ItemEntity;

public class ItemRepository {
    public ItemEntity getItem(String id, Session session){
        ItemEntity entity = session.get(ItemEntity.class, id);
        return entity;
    }

    public void updateItem(ItemEntity entity, Session session){
        session.update(entity);
    }
}
