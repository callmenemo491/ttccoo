package com.journeyapps.barcodescanner;

/* loaded from: classes.dex */
public class CaptureActivity extends android.app.Activity {

    /* renamed from: Y */
    public com.journeyapps.barcodescanner.C1254b f6663Y;

    /* renamed from: Z */
    public com.journeyapps.barcodescanner.DecoratedBarcodeView f6664Z;

    public CaptureActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r10) {
            r9 = this;
            super.onCreate(r10)
            r0 = 2131558695(0x7f0d0127, float:1.8742713E38)
            r9.setContentView(r0)
            r0 = 2131362782(0x7f0a03de, float:1.8345354E38)
            android.view.View r0 = r9.findViewById(r0)
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = (com.journeyapps.barcodescanner.DecoratedBarcodeView) r0
            r9.f6664Z = r0
            com.journeyapps.barcodescanner.b r0 = new com.journeyapps.barcodescanner.b
            com.journeyapps.barcodescanner.DecoratedBarcodeView r1 = r9.f6664Z
            r0.<init>(r9, r1)
            r9.f6663Y = r0
            android.content.Intent r1 = r9.getIntent()
            android.app.Activity r2 = r0.f6716a
            android.view.Window r2 = r2.getWindow()
            r3 = 128(0x80, float:1.8E-43)
            r2.addFlags(r3)
            r2 = -1
            if (r10 == 0) goto L37
            java.lang.String r3 = "SAVED_ORIENTATION_LOCK"
            int r10 = r10.getInt(r3, r2)
            r0.f6718c = r10
        L37:
            r10 = 2
            if (r1 == 0) goto Ldd
            java.lang.String r3 = "SCAN_ORIENTATION_LOCKED"
            r4 = 1
            boolean r3 = r1.getBooleanExtra(r3, r4)
            r5 = 0
            if (r3 == 0) goto L83
            int r3 = r0.f6718c
            if (r3 != r2) goto L7c
            android.app.Activity r2 = r0.f6716a
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            android.app.Activity r3 = r0.f6716a
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            if (r3 != r10) goto L6c
            if (r2 == 0) goto L79
            if (r2 != r4) goto L69
            goto L79
        L69:
            r2 = 8
            goto L7a
        L6c:
            if (r3 != r4) goto L79
            if (r2 == 0) goto L77
            r3 = 3
            if (r2 != r3) goto L74
            goto L77
        L74:
            r2 = 9
            goto L7a
        L77:
            r2 = 1
            goto L7a
        L79:
            r2 = 0
        L7a:
            r0.f6718c = r2
        L7c:
            android.app.Activity r2 = r0.f6716a
            int r3 = r0.f6718c
            r2.setRequestedOrientation(r3)
        L83:
            java.lang.String r2 = r1.getAction()
            java.lang.String r3 = "com.google.zxing.client.android.SCAN"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
            com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = r0.f6717b
            r2.m3688a(r1)
        L94:
            java.lang.String r2 = "BEEP_ENABLED"
            boolean r2 = r1.getBooleanExtra(r2, r4)
            if (r2 != 0) goto La0
            xb.d r2 = r0.f6724i
            r2.f27344b = r5
        La0:
            java.lang.String r2 = "SHOW_MISSING_CAMERA_PERMISSION_DIALOG"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto Lbb
            boolean r2 = r1.getBooleanExtra(r2, r4)
            java.lang.String r3 = "MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"
            java.lang.String r3 = r1.getStringExtra(r3)
            r0.f6720e = r2
            if (r3 == 0) goto Lb7
            goto Lb9
        Lb7:
            java.lang.String r3 = ""
        Lb9:
            r0.f6721f = r3
        Lbb:
            java.lang.String r2 = "TIMEOUT"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto Ld3
            android.os.Handler r3 = r0.f6725j
            zc.g r6 = new zc.g
            r6.<init>(r0, r5)
            r7 = 0
            long r7 = r1.getLongExtra(r2, r7)
            r3.postDelayed(r6, r7)
        Ld3:
            java.lang.String r2 = "BARCODE_IMAGE_ENABLED"
            boolean r1 = r1.getBooleanExtra(r2, r5)
            if (r1 == 0) goto Ldd
            r0.f6719d = r4
        Ldd:
            com.journeyapps.barcodescanner.b r0 = r9.f6663Y
            com.journeyapps.barcodescanner.DecoratedBarcodeView r1 = r0.f6717b
            zc.b r0 = r0.f6727l
            com.journeyapps.barcodescanner.BarcodeView r2 = r1.f6665a0
            com.journeyapps.barcodescanner.DecoratedBarcodeView$b r3 = new com.journeyapps.barcodescanner.DecoratedBarcodeView$b
            r3.<init>(r1, r0)
            r2.f6656B0 = r10
            r2.f6657C0 = r3
            r2.m3686i()
            return
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.journeyapps.barcodescanner.b r0 = r2.f6663Y
            r1 = 1
            r0.f6722g = r1
            xb.g r1 = r0.f6723h
            r1.m14174a()
            android.os.Handler r0 = r0.f6725j
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r1.f6664Z
            boolean r0 = r0.onKeyDown(r2, r3)
            if (r0 != 0) goto L11
            boolean r2 = super.onKeyDown(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.app.Activity
    public void onPause() {
            r8 = this;
            super.onPause()
            com.journeyapps.barcodescanner.b r0 = r8.f6663Y
            xb.g r1 = r0.f6723h
            r1.m14174a()
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r0.f6717b
            com.journeyapps.barcodescanner.BarcodeView r0 = r0.f6665a0
            ad.d r1 = r0.getCameraInstance()
            r0.mo3683c()
            long r2 = java.lang.System.nanoTime()
        L19:
            if (r1 == 0) goto L32
            boolean r0 = r1.f168g
            if (r0 != 0) goto L32
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r2
            r6 = 2000000000(0x77359400, double:9.881312917E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2c
            goto L32
        L2c:
            r4 = 1
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L32
            goto L19
        L32:
            return
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r3, java.lang.String[] r4, int[] r5) {
            r2 = this;
            com.journeyapps.barcodescanner.b r4 = r2.f6663Y
            java.util.Objects.requireNonNull(r4)
            r0 = 250(0xfa, float:3.5E-43)
            if (r3 != r0) goto L38
            int r3 = r5.length
            r0 = 0
            if (r3 <= 0) goto L19
            r3 = r5[r0]
            if (r3 != 0) goto L19
            com.journeyapps.barcodescanner.DecoratedBarcodeView r3 = r4.f6717b
            com.journeyapps.barcodescanner.BarcodeView r3 = r3.f6665a0
            r3.m3699e()
            goto L38
        L19:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "com.google.zxing.client.android.SCAN"
            r3.<init>(r5)
            r5 = 1
            java.lang.String r1 = "MISSING_CAMERA_PERMISSION"
            r3.putExtra(r1, r5)
            android.app.Activity r5 = r4.f6716a
            r5.setResult(r0, r3)
            boolean r3 = r4.f6720e
            if (r3 == 0) goto L35
            java.lang.String r3 = r4.f6721f
            r4.m3703b(r3)
            goto L38
        L35:
            r4.m3702a()
        L38:
            return
    }

    @Override // android.app.Activity
    public void onResume() {
            r6 = this;
            super.onResume()
            com.journeyapps.barcodescanner.b r0 = r6.f6663Y
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 23
            if (r1 < r3) goto L30
            android.app.Activity r1 = r0.f6716a
            java.lang.String r3 = "android.permission.CAMERA"
            int r1 = p046d0.C1259a.m3705a(r1, r3)
            if (r1 != 0) goto L1e
            com.journeyapps.barcodescanner.DecoratedBarcodeView r1 = r0.f6717b
            com.journeyapps.barcodescanner.BarcodeView r1 = r1.f6665a0
            r1.m3699e()
            goto L37
        L1e:
            boolean r1 = r0.f6729n
            if (r1 != 0) goto L37
            android.app.Activity r1 = r0.f6716a
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r4 = 250(0xfa, float:3.5E-43)
            p030c0.C0814a.m2463c(r1, r3, r4)
            r0.f6729n = r2
            goto L37
        L30:
            com.journeyapps.barcodescanner.DecoratedBarcodeView r1 = r0.f6717b
            com.journeyapps.barcodescanner.BarcodeView r1 = r1.f6665a0
            r1.m3699e()
        L37:
            xb.g r0 = r0.f6723h
            boolean r1 = r0.f27350c
            if (r1 != 0) goto L4d
            android.content.Context r1 = r0.f27348a
            android.content.BroadcastReceiver r3 = r0.f27349b
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r4.<init>(r5)
            r1.registerReceiver(r3, r4)
            r0.f27350c = r2
        L4d:
            android.os.Handler r1 = r0.f27351d
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            boolean r1 = r0.f27353f
            if (r1 == 0) goto L61
            android.os.Handler r1 = r0.f27351d
            java.lang.Runnable r0 = r0.f27352e
            r2 = 300000(0x493e0, double:1.482197E-318)
            r1.postDelayed(r0, r2)
        L61:
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            com.journeyapps.barcodescanner.b r0 = r2.f6663Y
            int r0 = r0.f6718c
            java.lang.String r1 = "SAVED_ORIENTATION_LOCK"
            r3.putInt(r1, r0)
            return
    }
}
