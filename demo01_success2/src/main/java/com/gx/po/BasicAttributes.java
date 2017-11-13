package com.gx.po;

import java.util.HashSet;
import java.util.Set;

// Generated 2017-11-3 14:43:34 by Hibernate Tools 3.4.0.CR1

/**
 * BasicAttributes generated by hbm2java
 */
public class BasicAttributes implements java.io.Serializable {

	private Integer basicAttributesId;
	private Integer attributesId;
	private String attributeVlue;
	
	//用集合表示一个分类里的所有文章
	private Set<WebArticle> setWebArticle=new HashSet<WebArticle>();
	
	public Set<WebArticle> getSetWebArticle() {
		return setWebArticle;
	}

	public void setSetWebArticle(Set<WebArticle> setWebArticle) {
		this.setWebArticle = setWebArticle;
	}

	public BasicAttributes() {
	}

	public BasicAttributes(Integer attributesId, String attributeVlue) {
		this.attributesId = attributesId;
		this.attributeVlue = attributeVlue;
	}

	public Integer getBasicAttributesId() {
		return this.basicAttributesId;
	}

	public void setBasicAttributesId(Integer basicAttributesId) {
		this.basicAttributesId = basicAttributesId;
	}

	public Integer getAttributesId() {
		return this.attributesId;
	}

	public void setAttributesId(Integer attributesId) {
		this.attributesId = attributesId;
	}

	public String getAttributeVlue() {
		return this.attributeVlue;
	}

	public void setAttributeVlue(String attributeVlue) {
		this.attributeVlue = attributeVlue;
	}

}