package p249o7;

/* renamed from: o7.s4 */
/* loaded from: classes.dex */
public final class C5098s4 {

    /* renamed from: a */
    public final android.content.Context f19990a;

    /* renamed from: b */
    public java.lang.String f19991b;

    /* renamed from: c */
    public java.lang.String f19992c;

    /* renamed from: d */
    public java.lang.String f19993d;

    /* renamed from: e */
    public java.lang.Boolean f19994e;

    /* renamed from: f */
    public long f19995f;

    /* renamed from: g */
    public p185k7.C4034x0 f19996g;

    /* renamed from: h */
    public boolean f19997h;

    /* renamed from: i */
    public final java.lang.Long f19998i;

    /* renamed from: j */
    public java.lang.String f19999j;

    public C5098s4(android.content.Context r4, p185k7.C4034x0 r5, java.lang.Long r6) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f19997h = r0
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r4, r1)
            r3.f19990a = r4
            r3.f19998i = r6
            if (r5 == 0) goto L3f
            r3.f19996g = r5
            java.lang.String r4 = r5.f16941d0
            r3.f19991b = r4
            java.lang.String r4 = r5.f16940c0
            r3.f19992c = r4
            java.lang.String r4 = r5.f16939b0
            r3.f19993d = r4
            boolean r4 = r5.f16938a0
            r3.f19997h = r4
            long r1 = r5.f16937Z
            r3.f19995f = r1
            java.lang.String r4 = r5.f16943f0
            r3.f19999j = r4
            android.os.Bundle r4 = r5.f16942e0
            if (r4 == 0) goto L3f
            java.lang.String r5 = "dataCollectionDefaultEnabled"
            boolean r4 = r4.getBoolean(r5, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.f19994e = r4
        L3f:
            return
    }
}
