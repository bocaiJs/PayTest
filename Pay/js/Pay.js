/*
 * @Description: Bocai
 * @Author: Bocai
 * @LastEditors: Please set LastEditors
 * @Date: 2019-04-15 21:35:27
 * @LastEditTime: 2019-04-15 21:37:59
 */

// ToastExample.js
/**
 * This exposes the native ToastExample module as a JS module. This has a
 * function 'show' which takes the following parameters:
 *
 * 1. String message: A string with the text to toast
 * 2. int duration: The duration of the toast. May be ToastExample.SHORT or
 *    ToastExample.LONG
 */
import { NativeModules } from "react-native";
// 下一句中的ToastExample即对应上文
// public String getName()中返回的字符串
console.log("_______________");
console.log(NativeModules);
console.log(NativeModules.PayKuaiKou);
module.exports = NativeModules.PayKuaiKou;