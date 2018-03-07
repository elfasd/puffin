package com.asd.puffin.modules.service.impl;

import com.asd.puffin.modules.mapper.FzaccMapper;
import com.asd.puffin.modules.pojo.Fzacc;
import com.asd.puffin.modules.service.TestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "testService")
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private FzaccMapper fzaccMapper;


    @Override
    public void test() {

        Fzacc acc = fzaccMapper.selectByPrimaryKey("AOTR200500003441");


        Fzacc acc1 = new Fzacc();
        Fzacc acc2 = new Fzacc();

        BeanUtils.copyProperties(acc,acc1);
        BeanUtils.copyProperties(acc,acc2);

        acc1.setAccno("1");
        fzaccMapper.insert(acc1);
        System.out.println(1/0);
        acc2.setAccno("2");
        fzaccMapper.insert(acc2);
        System.out.println("1212121=" +acc.getComcode());
    }
}
