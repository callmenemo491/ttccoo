package p178k0;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public class C3627c {

    /* renamed from: a */
    public final p178k0.C3637m f16008a;

    /* renamed from: b */
    public final android.os.Handler f16009b;

    public C3627c(p178k0.C3637m r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.f16008a = r1
            r0.f16009b = r2
            return
    }

    /* renamed from: a */
    public void m8071a(p178k0.C3634j.a r4) {
            r3 = this;
            int r0 = r4.f16031b
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto L18
            android.graphics.Typeface r4 = r4.f16030a
            k0.m r0 = r3.f16008a
            android.os.Handler r1 = r3.f16009b
            k0.a r2 = new k0.a
            r2.<init>(r3, r0, r4)
            r1.post(r2)
            goto L24
        L18:
            k0.m r4 = r3.f16008a
            android.os.Handler r1 = r3.f16009b
            k0.b r2 = new k0.b
            r2.<init>(r3, r4, r0)
            r1.post(r2)
        L24:
            return
    }
}
