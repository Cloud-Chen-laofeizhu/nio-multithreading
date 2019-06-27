package com.chendianqv.pool;

import java.nio.channels.ServerSocketChannel;

public interface Boss {
	
	/**
	 * 加入一个新的ServerSocket
	 */
	void registerAcceptChannelTask(ServerSocketChannel serverChannel);
}
