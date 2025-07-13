package p249o7;

/* renamed from: o7.n3 */
/* loaded from: classes.dex */
public final class C5057n3 {

    /* renamed from: a */
    public final java.lang.String f19900a;

    /* renamed from: b */
    public final boolean f19901b;

    /* renamed from: c */
    public boolean f19902c;

    /* renamed from: d */
    public boolean f19903d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.measurement.internal.C1112c f19904e;

    public C5057n3(com.google.android.gms.measurement.internal.C1112c r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.f19904e = r1
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f19900a = r2
            r0.f19901b = r3
            return
    }

    /* renamed from: a */
    public final void m11369a(boolean r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.c r0 = r2.f19904e
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.f19900a
            r0.putBoolean(r1, r3)
            r0.apply()
            r2.f19903d = r3
            return
    }

    /* renamed from: b */
    public final boolean m11370b() {
            r3 = this;
            boolean r0 = r3.f19902c
            if (r0 != 0) goto L17
            r0 = 1
            r3.f19902c = r0
            com.google.android.gms.measurement.internal.c r0 = r3.f19904e
            android.content.SharedPreferences r0 = r0.m3147p()
            java.lang.String r1 = r3.f19900a
            boolean r2 = r3.f19901b
            boolean r0 = r0.getBoolean(r1, r2)
            r3.f19903d = r0
        L17:
            boolean r0 = r3.f19903d
            return r0
    }
}
