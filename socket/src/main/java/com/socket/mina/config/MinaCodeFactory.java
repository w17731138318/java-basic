package com.socket.mina.config;

import org.springframework.stereotype.Component;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineDecoder;
import org.apache.mina.filter.codec.textline.TextLineEncoder;

import java.nio.charset.Charset;

/**
 * MinaCodeFactory
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-05 17:05
 * @see
 **/
@Component
public class MinaCodeFactory implements ProtocolCodecFactory{

	public MinaCodeFactory() {
		this(Charset.forName("gb2312"));
	}

	/**
	 * 加密
	 */
	private final TextLineEncoder encoder;
	/**
	 * 解密
	 */
	private final TextLineDecoder decoder;
	/* final static char endchar = 0x1a; */
	final static char endchar = 0x0d;

	public MinaCodeFactory(Charset charset) {
		encoder = new TextLineEncoder(charset, LineDelimiter.UNIX);
		decoder = new TextLineDecoder(charset, LineDelimiter.AUTO);
	}


	@Override
	public ProtocolEncoder getEncoder(IoSession ioSession) throws Exception {
		return encoder;
	}

	@Override
	public ProtocolDecoder getDecoder(IoSession ioSession) throws Exception {
		return decoder;
	}

	public int getEncoderMaxLineLength() {
		return encoder.getMaxLineLength();
	}

	public void setEncoderMaxLineLength(int maxLineLength) {
		encoder.setMaxLineLength(maxLineLength);
	}

	public int getDecoderMaxLineLength() {
		return decoder.getMaxLineLength();
	}

	public void setDecoderMaxLineLength(int maxLineLength) {
		decoder.setMaxLineLength(maxLineLength);
	}
}
