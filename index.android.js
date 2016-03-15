/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 */
'use strict';
import React, {
    AppRegistry,
    Component,
    StyleSheet,
    Text,
    View,
    TouchableOpacity,
    NativeModules
} from 'react-native';

//import OpenActivity from './OpenActivity';
var OpenActivity = require('./OpenActivity');

class RNAndPrimaryMixed extends Component {
    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.welcome}>
                    Welcome to React Native!
                </Text>
                <Text style={styles.instructions}>
                    To get started, edit index.android.js
                </Text>
                <TouchableOpacity
                    onPress={()=>{
                        OpenActivity.openActivity();
                    }}
                >
                    <Text style={styles.instructions}>
                        打开一个Activity
                    </Text>
                </TouchableOpacity>
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
        fontSize: 20,
    },
});

AppRegistry.registerComponent('RNAndPrimaryMixed', () => RNAndPrimaryMixed);
