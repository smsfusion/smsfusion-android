
# HLRCallback

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID for response |  [optional]
**msisdn** | **Long** | The MSISDN of the number queried |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Short status code of the response |  [optional]
**country** | **String** | ISO 3166-2 country code |  [optional]
**operator** | **String** | The operator attached to the MSISDN |  [optional]
**mccmnc** | **Integer** | MCC and MNC of MSDISDN |  [optional]
**duration** | [**DurationEnum**](#DurationEnum) | If the response code is temporary or permenant |  [optional]
**message** | **String** | Full status code of the response |  [optional]
**extended** | **String** | Extended explanation of the status code |  [optional]
**cost** | **Float** | Cost of the response |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----


<a name="DurationEnum"></a>
## Enum: DurationEnum
Name | Value
---- | -----



