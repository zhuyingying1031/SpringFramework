package net.xdclass.sp.proxy;

public interface PayService {
	/**
	 * 支付回调
	 * @param outTradeNo
	 * @return
	 */
	String callback(String outTradeNo);
	/**
	 * 下单
	 * @param userId
	 * @param productId
	 * @return
	 */
	int save(int userId,int productId);


}
