package com.xiyw.ioc_demo.ioc03;

public class Site {

	private String homeUrl;
	
	private String url;
	
	private IndexPage indexPage;

	public String getHomeUrl() {
		return homeUrl;
	}

	public void setHomeUrl(String homeUrl) {
		this.homeUrl = homeUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public IndexPage getIndexPage() {
		return indexPage;
	}

	public void setIndexPage(IndexPage indexPage) {
		this.indexPage = indexPage;
	}

	@Override
	public String toString() {
		return "Site [homeUrl=" + homeUrl + ", url=" + url + ", indexPage=" + indexPage + "]";
	}
	
	
	
}
