package ssafy.runner.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ssafy.runner.domain.entity.ShopImage;

import java.util.Optional;

public interface ShopImageRepository extends JpaRepository<ShopImage, Long> {

    @Query("select si.imgUrl from ShopImage si " +
            "where si.id = :shopImageId and si.idx = :index")
    Optional<String> findByIdAndIndex(@Param("shopImageId") Long id, @Param("index") int index);
}
