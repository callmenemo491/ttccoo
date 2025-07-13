package p249o7;

/* renamed from: o7.p3 */
/* loaded from: classes.dex */
public final class C5073p3 {

    /* renamed from: a */
    public final java.lang.String f19932a;

    /* renamed from: b */
    public final long f19933b;

    /* renamed from: c */
    public boolean f19934c;

    /* renamed from: d */
    public long f19935d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.measurement.internal.C1112c f19936e;

    public C5073p3(com.google.android.gms.measurement.internal.C1112c r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.f19936e = r1
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f19932a = r2
            r0.f19933b = r3
            return
    }

    /* renamed from: a */
    public final long m11410a() {
            r4 = this;
            boolean r0 = r4.f19934c
            if (r0 != 0) goto L17
            r0 = 1
            r4.f19934c = r0
            com.google.android.gms.measurement.internal.c r0 = r4.f19936e
            android.content.SharedPreferences r0 = r0.m3147p()
            java.lang.String r1 = r4.f19932a
            long r2 = r4.f19933b
            long r0 = r0.getLong(r1, r2)
            r4.f19935d = r0
        L17:
            long r0 = r4.f19935d
            return r0
    }

    /* renamed from: b */
    public final void m11411b(long r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.c r0 = r2.f19936e
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.f19932a
            r0.putLong(r1, r3)
            r0.apply()
            r2.f19935d = r3
            return
    }
}
