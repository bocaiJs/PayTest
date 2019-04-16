/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react';
import { Platform, StyleSheet, Text, View, DeviceEventEmitter } from 'react-native';
import PayKuaiKou from './js/Pay'
type Props = {};
export default class App extends Component<Props> {
    componentWillMount() {
        DeviceEventEmitter.addListener('Pay_Resp', (e) => {
            // handle event.
            console.log(e);
        });
    }
    render() {
        return (
            <View style={styles.container}>
                <Text
                    style={styles.welcome} style={{ paddingTop: 20, paddingBottom: 20, paddingLeft: 20, paddingRight: 20, backgroundColor: "yellow" }}
                    onPress={() => {
                        console.log(PayKuaiKou);
                        PayKuaiKou.pay('2228b16de2828503e1e7863a92c780daf');
                    }}
                >测试</Text>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});
