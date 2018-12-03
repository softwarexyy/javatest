package nxy;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		String field53 = "3400000000000000";
		//国际单倍
		if( field53.matches( "^[012]0.*" ) ){
			System.out.println("国际单倍");
			//    mac = service.genPackagePosMac( strMab, util.getZAKSYS( in_data_node.getValue( "field41" ) ), 3, 1 ).substring( 0, 8 );
        //国际双倍
        }else if( field53.matches( "^[012]6.*" ) ){
        	System.out.println("国际双倍");
            //mab,主密钥,3：X9.19算法,1:单倍
        	//    mac = service.genPackagePosMac( strMab, util.getZAKSYS( in_data_node.getValue( "field41" ) ), 3, 1 ).substring( 0, 8 );
        //国密
        }else if( field53.matches( "^[012]4.*" ) ){
        	System.out.println("国密");
        	//   mac = service.genPackagePosMac( strMab, util.getZAKSYS( in_data_node.getValue( "field41" ) ), 3, 4 ).substring( 0, 8 );
        }else{
        	System.out.println("ERROR");
        	//    throw new TxnErrorException( "77", "密钥格式错误，支持国际单倍、双倍以及国密" );
        }
		//    TrcLog.log( "VerificationMac.log", "mac1::::::::::::::::::::::" + mac + "    "  + in_data_node.getValue( "field64" ));
		//   if( !mac.equals( in_data_node.getValue( "field64" ) ) ){
		//       throw new TxnErrorException( "A0", "校验mac失败" );
		//  }
	}

}
