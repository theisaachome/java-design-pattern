package com.isaachome.youtube;

public class Subscriber {
	private String name;
	private Channel channel;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Channel getChannel() {
		return channel;
	}


	public void setChannel(Channel channel) {
		this.channel = channel;
	}


	public void update() {
		System.out.println("Hey" );
	}
	
}
