package com.example.android.usbconnect;

import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    UsbDevice device;
    UsbDevice device1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = new Intent();

        device = (UsbDevice) intent.getParcelableExtra(UsbManager.EXTRA_DEVICE);
       int deviceId =  device.getDeviceId();

        if (deviceId != 0){
            textView.setText("Camera Attached");
        }else{
            textView.setText("No Devices Attached!");
        }


    }
}
