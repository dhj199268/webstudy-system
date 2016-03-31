package com.core.util.generic;

public interface GenericDao<Model, PK> {
	/**
     * �������
     *
     * @param model ����
     */
    int insertSelective(Model model);

    /**
     * ���¶���
     *
     * @param model ����
     */
    int updateByPrimaryKeySelective(Model model);

    /**
     * ͨ������, ɾ������
     *
     * @param id ����
     */
    int deleteByPrimaryKey(PK id);

    /**
     * ͨ������, ��ѯ����
     *
     * @param id ����
     * @return
     */
    Model selectByPrimaryKey(PK id);
}
