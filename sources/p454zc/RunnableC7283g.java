package p454zc;

/* renamed from: zc.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7283g implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f27936Y;

    /* renamed from: Z */
    public final /* synthetic */ com.journeyapps.barcodescanner.C1254b f27937Z;

    public /* synthetic */ RunnableC7283g(com.journeyapps.barcodescanner.C1254b r1, int r2) {
            r0 = this;
            r0.f27936Y = r2
            r0.<init>()
            r0.f27937Z = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f27936Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L22
        L6:
            com.journeyapps.barcodescanner.b r0 = r4.f27937Z
            java.util.Objects.requireNonNull(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.zxing.client.android.SCAN"
            r1.<init>(r2)
            r2 = 1
            java.lang.String r3 = "TIMEOUT"
            r1.putExtra(r3, r2)
            android.app.Activity r2 = r0.f6716a
            r3 = 0
            r2.setResult(r3, r1)
            r0.m3702a()
            return
        L22:
            com.journeyapps.barcodescanner.b r0 = r4.f27937Z
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "b"
            java.lang.String r2 = "Finishing due to inactivity"
            android.util.Log.d(r1, r2)
            android.app.Activity r0 = r0.f6716a
            r0.finish()
            return
    }
}
