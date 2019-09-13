package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.LetterAudioDao;
import com.shetuan.dao.LetterSourceDao;
import com.shetuan.entity.LetterAudio;
import com.shetuan.entity.LetterSource;

@Repository("LetterAudioDaoImpl")
public class LetterAudioDaoImpl extends BaseDaoImpl<LetterAudio,Long> implements LetterAudioDao{
	
}