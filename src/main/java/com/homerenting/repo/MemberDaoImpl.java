package com.homerenting.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.homerenting.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(MemberDaoImpl.COMPONENT_NAME)
@Transactional
public class MemberDaoImpl implements MemberDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(MemberDaoImpl.class);

    public static final String COMPONENT_NAME = "memberDaoImpl";

    @Autowired
    private EntityManager em;

    public Member findById(Long id) {
        slf4jLogger.info("==Member findById(Long id)==");
        return em.find(Member.class, id);
    }

    public Member findByEmail(String email) {
        slf4jLogger.info("==Member findByEmail(String email)==");
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Member> criteria = builder.createQuery(Member.class);
        Root<Member> member = criteria.from(Member.class);

        criteria.select(member).where(builder.equal(member.get("email"), email));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Member> findAllOrderedByName() {
        slf4jLogger.info("==List<Member> findAllOrderedByName()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Member> criteria = cb.createQuery(Member.class);
        Root<Member> member = criteria.from(Member.class);

        criteria.select(member).orderBy(cb.asc(member.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(Member member) {
        slf4jLogger.info("==void register(Member member)==");
        em.persist(member);
        return;
    }
}
