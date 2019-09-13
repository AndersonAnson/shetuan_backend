package com.shetuan.entity;

public interface LetterSource {
	public Long getId();

	public void setId(Long id) ;

	public Letter getLetter();

	public void setLetter(Letter letter);
	
	public String getName() ;

	public void setName(String name);

	public String getUrl();

	public void setUrl(String url);
}
