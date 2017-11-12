package com.jeesuite.passport.snslogin;

import java.io.Serializable;

public class OauthUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fromClientId;
	private String openId;
	private String nickname;
	private String avatar;
	private String gender; // male/female/unknow
	private String unionId;
	private String snsType;
	

	public String getFromClientId() {
		return fromClientId;
	}

	public void setFromClientId(String fromClientId) {
		this.fromClientId = fromClientId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	

	public String getSnsType() {
		return snsType;
	}

	public void setSnsType(String snsType) {
		this.snsType = snsType;
	}

	public String userInfoToUrlQueryString(){
		return String.format("nickname=%s&gender=%s&avatar=%s", nickname,gender,avatar);
	}

}
