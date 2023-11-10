package com.backy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*create table team(
	    uno NUMBER(5) primary key,
	    uname varchar2(20) not null,
	    phone VARCHAR2(11) not null,
	    age number(3) not null
	 );*/
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	int uno;
	String uname;
	String phone;
	int age;
}
