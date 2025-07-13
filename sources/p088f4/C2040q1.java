package p088f4;

/* renamed from: f4.q1 */
/* loaded from: classes.dex */
public final class C2040q1 {

    /* renamed from: a */
    public final android.net.wifi.WifiManager f9292a;

    /* renamed from: b */
    public android.net.wifi.WifiManager.WifiLock f9293b;

    /* renamed from: c */
    public boolean f9294c;

    /* renamed from: d */
    public boolean f9295d;

    public C2040q1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            r1.f9292a = r2
            return
    }

    /* renamed from: a */
    public final void m5384a() {
            r2 = this;
            android.net.wifi.WifiManager$WifiLock r0 = r2.f9293b
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.f9294c
            if (r1 == 0) goto L11
            boolean r1 = r2.f9295d
            if (r1 == 0) goto L11
            r0.acquire()
            goto L14
        L11:
            r0.release()
        L14:
            return
    }
}
