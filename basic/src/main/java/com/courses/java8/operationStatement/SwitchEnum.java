package com.courses.java8.operationStatement;

public class SwitchEnum {

	public static void main(String[] args) {

	String path = "ExternalDocumentType.documentType";
	
	//CustomRoutingTypeEnum crte = CustomRoutingTypeEnum.values().getPath().valueOf();
//	
//		if (CustomRoutingTypeEnum.ORDER_TYPE.getPath().equals(path)) {
//			
//		}
//		if (CustomRoutingTypeEnum.ORDER_TYPE.getPath().equals(path)) {
//					
//		}
//		if (CustomRoutingTypeEnum.ORDER_TYPE.getPath().equals(path)) {
//			
//		}
//		if (CustomRoutingTypeEnum.ORDER_TYPE.getPath().equals(path)) {
//			
//		}
	
		CustomRoutingTypeEnum rno=CustomRoutingTypeEnum.valueOf("ORDER_TYPE");
		
		System.out.print("numero: " + rno);
	}

}


enum CustomRoutingTypeEnum {

    ORDER_TYPE ("Order Type","OrderRequestHeader.orderType"),
    EXTERNAL_DOCUMENT_TYPE ("External Document Type", "ExternalDocumentType.documentType"),
    PLANNING_TYPE ("Planning Type","ItemOutIndustry.planningType"),
    ITEM_CATEGORY("Item Category", "ItemOut.itemCategory");

    private String name;
    private String path;

     CustomRoutingTypeEnum (String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName () {
        return name;
    }

    public String getPath () {
        return path;
    }
}

