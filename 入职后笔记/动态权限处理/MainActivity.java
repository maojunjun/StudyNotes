package cn.msyx.dynamicpermissionrequest;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * 用于保存请求权限的结合
     */
    List<String> permissionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void requestPermission(View view){
        requestPermission();
    }

    /**
     * 动态请求权限
     */
    private void requestPermission() {

        //判断权限是否已经获取，如果没有则将权限描述加入List集合，供后面动态申请
        if (ContextCompat.checkSelfPermission(MainActivity.this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            permissionList.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }
        if(ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.READ_PHONE_STATE)
                != PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.READ_PHONE_STATE);
        }
        if(ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }

        if(!permissionList.isEmpty()){
//          将List中保存的权限描述保存到一个String数组中
            String[] permissions = permissionList.toArray(new String[permissionList.size()]);

//          通过ActivityCompat去动态请求权限
            ActivityCompat.requestPermissions(MainActivity.this,permissions,1);
        }else{
            Toast.makeText(this, "权限请求成功！", Toast.LENGTH_SHORT).show();
        }

    }


    /**
     * requestPermissions方法执行完成后的回调，用于检查权限是否请求成功,requestPermissions中所有的权限请求完毕后才回调该方法
     *
     * @param requestCode  请求码，对应requestPermissions方法的第三个参数，从requestPermissions方法中传递过来，用于标记是哪次请求
     * @param permissions  返回requestPermissions方法中请求的权限所对应的名称,如：android.permission.ACCESS_FINE_LOCATION
     * @param grantResults 返回权限申请的结果，保存在一个数组中，对应permissions数组中的权限，只有两种结果，1是权限请求成功： android.content.pm.PackageManager.PERMISSION_GRANTED
     *                      2是权限请求失败android.content.pm.PackageManager.PERMISSION_DENIED.
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
             case 1:
                 if(grantResults.length > 0){
                     for(int result : grantResults){
                         if(result != PackageManager.PERMISSION_GRANTED){
                             Toast.makeText(MainActivity.this, "必须同意所有权限才能使用本程序", Toast.LENGTH_SHORT).show();
                             finish();
                             return;
                         }
                         // TODO: 2017/1/17  Task when permission requested successfully
                     }
                 }else{
                     Toast.makeText(this, "发生未知错误", Toast.LENGTH_SHORT).show();
                     finish();
                 }
               break;
             default:
             break;
                }

    }

}
