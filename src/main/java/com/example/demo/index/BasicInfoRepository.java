package com.example.demo.index;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
    List<BasicInfo> findAllByOrderByIdDesc();
    @Query("Select distinct x from BasicInfo x  inner join Boston y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByBostonBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join CDR y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByCDRBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join DailyLife y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByDailyLifeBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join Execution y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByExecutionBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join Gait y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByGaitBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join HAMA y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByHAMABasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join HAMD y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByHAMDBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join Memory y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByMemoryBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join MMSE y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByMMSEBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join MOCA y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByMOCABasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join NIHSS y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByNIHSSBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join SilhouetteQuiz y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllBySilhouetteQuizBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join VisualReproduction y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByVisualReproductionBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join Other y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByOtherBasicInfoId();
    @Query("Select distinct x from BasicInfo x  inner join Testing y on y.basicInfoId = x.id order by x.id DESC")
    List<BasicInfo> findAllByTestingBasicInfoId();
}
