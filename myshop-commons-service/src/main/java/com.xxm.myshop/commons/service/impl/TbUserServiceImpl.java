package com.xxm.myshop.commons.service.impl;

import com.xxm.myshop.commons.domain.TbUser;
import com.xxm.myshop.commons.mapper.TbUserMapper;
import com.xxm.myshop.commons.service.TbUserService;
import org.springframework.stereotype.Service;

@Service
public class TbUserServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements TbUserService {
}
