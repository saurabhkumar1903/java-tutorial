package com.base64;

import java.util.Base64;

public class UrlEncoder {
	public static void main(String[] args) {

		String url = "http://172.18.17.165:8082/config/users?ts=1556268096170&loggedInOrgId=NPCI&pageNo=1&pageSize=10&role=ROLE_ALL&selectedOrgId=HDF&sorter=";
		Base64.Encoder enc = Base64.getUrlEncoder();
		Base64.Decoder dec = Base64.getUrlDecoder();
		byte[] encoded = enc.encode(url.getBytes());
		System.out.println("EncodedUrl:" + encoded);
		byte[] decoded = dec.decode(encoded);
		System.out.println("DecodedUrl:" + new String(decoded));
	}

}
