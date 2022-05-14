package com.sara.waie.androidprojectmanagmentsystem.model

/**
 * @param addressLine1 eg:door num, Street name
 * @param addressLine2 eg:village
 * @param city
 * @param state
 * @param country
 * @param postalCode
 * @param phoneNumber
 * @param mobileNumber
 * @param isMobileVerified
 * */
data class Contact(
    var addressLine1: String,
    var addressLine2: String,
    var city: String,
    var state: String,
    var country: String,
    var postalCode:String,
    var phoneNumber:String,
    var mobileNumber:String,
    val isMobileVerified:Boolean
){
    //ToDo:Validate Mobile & Phone number
    //ToDo:Validate Email
    //ToDo:Verify MobileNumber with SMS

}
