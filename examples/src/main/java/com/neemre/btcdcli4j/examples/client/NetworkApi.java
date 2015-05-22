package com.neemre.btcdcli4j.examples.api;

import java.util.Properties;

import org.apache.http.impl.client.CloseableHttpClient;

import com.neemre.btcdcli4j.examples.util.ResourceUtils;

/**A list of examples demonstrating the use of <i>bitcoind</i>'s 'Network API' RPCs currently 
 * supported by btcd-cli4j. Calling any of the methods below will cause a short overview 
 * (<i>i.e.</i> of the results of the operation) to be written to {@code stdout}.*/
public class NetworkApi {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpProvider = ResourceUtils.getHttpProvider();
		Properties nodeConfig = ResourceUtils.getNodeConfig();
		ApiCalls supportedCalls = new ApiCalls(httpProvider, nodeConfig);
		
		supportedCalls.getPeerInfo();
		supportedCalls.ping();
	}
}