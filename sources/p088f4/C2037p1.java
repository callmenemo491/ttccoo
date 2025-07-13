package p088f4;

/* renamed from: f4.p1 */
/* loaded from: classes.dex */
public final class C2037p1 {

    /* renamed from: a */
    public final android.os.PowerManager f9280a;

    /* renamed from: b */
    public android.os.PowerManager.WakeLock f9281b;

    /* renamed from: c */
    public boolean f9282c;

    /* renamed from: d */
    public boolean f9283d;

    public C2037p1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "power"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r1.f9280a = r2
            return
    }

    @android.annotation.SuppressLint({"WakelockTimeout"})
    /* renamed from: a */
    public final void m5380a() {
            r2 = this;
            android.os.PowerManager$WakeLock r0 = r2.f9281b
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.f9282c
            if (r1 == 0) goto L11
            boolean r1 = r2.f9283d
            if (r1 == 0) goto L11
            r0.acquire()
            goto L14
        L11:
            r0.release()
        L14:
            return
    }
}
