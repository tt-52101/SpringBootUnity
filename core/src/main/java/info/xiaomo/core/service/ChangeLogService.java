package info.xiaomo.core.service;

import info.xiaomo.core.model.ChangeLogModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * @github: https://github.com/qq83387856
 * @email: hupengbest@163.com
 * @QQ_NO: 83387856
 * @Date: 2016/4/1119:49
 * @Description:
 * @Copyright(©) 2015 by xiaomo.
 **/
public interface ChangeLogService {

    ChangeLogModel findById(Long id);

    ChangeLogModel findByName(String name);

    Page<ChangeLogModel> findAll(Pageable pageable);

    ChangeLogModel add(ChangeLogModel model);

    ChangeLogModel update(ChangeLogModel model);

    ChangeLogModel delete(Long id);
}
