package nxy;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		String field53 = "3400000000000000";
		//���ʵ���
		if( field53.matches( "^[012]0.*" ) ){
			System.out.println("���ʵ���");
			//    mac = service.genPackagePosMac( strMab, util.getZAKSYS( in_data_node.getValue( "field41" ) ), 3, 1 ).substring( 0, 8 );
        //����˫��
        }else if( field53.matches( "^[012]6.*" ) ){
        	System.out.println("����˫��");
            //mab,����Կ,3��X9.19�㷨,1:����
        	//    mac = service.genPackagePosMac( strMab, util.getZAKSYS( in_data_node.getValue( "field41" ) ), 3, 1 ).substring( 0, 8 );
        //����
        }else if( field53.matches( "^[012]4.*" ) ){
        	System.out.println("����");
        	//   mac = service.genPackagePosMac( strMab, util.getZAKSYS( in_data_node.getValue( "field41" ) ), 3, 4 ).substring( 0, 8 );
        }else{
        	System.out.println("ERROR");
        	//    throw new TxnErrorException( "77", "��Կ��ʽ����֧�ֹ��ʵ�����˫���Լ�����" );
        }
		//    TrcLog.log( "VerificationMac.log", "mac1::::::::::::::::::::::" + mac + "    "  + in_data_node.getValue( "field64" ));
		//   if( !mac.equals( in_data_node.getValue( "field64" ) ) ){
		//       throw new TxnErrorException( "A0", "У��macʧ��" );
		//  }
	}

}
