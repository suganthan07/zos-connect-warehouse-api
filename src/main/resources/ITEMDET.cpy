************************************************************************
**         File: ITEMDET.cpy                                        
**         Description: This file contains layout for the WarehouseApi
**                      testing. It is a copy of the original 
**                      WarehouseApi.yaml file.
************************************************************************
           01 WS-INPUT-REQUEST.
              05 WS-ITEM-ID        PIC X(10).
           01 WS-OUTPUT-RESPONSE.
              05 WS-ITEM-ID        PIC X(10).
              05 WS-ITEM-DESC      PIC X(50).
              05 WS-ITEM-HT        PIC 9(5)V99.
              05 WS-ITEM-WT        PIC 9(5)V99.
              05 WS-ITEM-PRICE     PIC 9(5)V99.
              05 WS-ITEM-SUPPLIER  PIC X(50).
              05 WS-ITEM-STOCK     PIC 9(3).
           01 WS-RESPONSE-DETAILS.
              05 WS-RESPONSE-CODE  PIC 9(3).
              05 WS-RESPONSE-MSG   PIC X(100).