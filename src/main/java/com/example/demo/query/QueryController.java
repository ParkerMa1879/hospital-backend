//package com.example.demo.query;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:8081")
//@RestController
//@RequestMapping("/api")
//public class QueryController {
//    @PersistenceContext
//    private EntityManager entityManager;
//    @GetMapping("/queries")
//    public List<BasicInfo> query(String[] tables, String[] inequalities, String[] values) {
//        int len = tables.length;
//        for (int x = 0; x < len; x++) {
//            TypedQuery<BasicInfo> query = entityManager.createQuery
//                    ("SELECT b FROM tb_basic_info b Left join " + tables[x] + " x on b.id = x.patient.id where x " + inequalities[x] + " " + values[x], BasicInfo.class);
//            return query.getResultList();
//        }
//        return null;
//    }
//}
