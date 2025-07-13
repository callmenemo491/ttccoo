package p371v5;

/* renamed from: v5.w */
/* loaded from: classes.dex */
public class C6573w implements p371v5.InterfaceC6553c {
    public C6573w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p371v5.InterfaceC6553c
    /* renamed from: a */
    public long mo13334a() {
            r2 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            return r0
    }

    @Override // p371v5.InterfaceC6553c
    /* renamed from: b */
    public p371v5.InterfaceC6563m mo13335b(android.os.Looper r3, android.os.Handler.Callback r4) {
            r2 = this;
            v5.x r0 = new v5.x
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r3, r4)
            r0.<init>(r1)
            return r0
    }

    @Override // p371v5.InterfaceC6553c
    /* renamed from: c */
    public void mo13336c() {
            r0 = this;
            return
    }

    @Override // p371v5.InterfaceC6553c
    /* renamed from: d */
    public long mo13337d() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }
}
