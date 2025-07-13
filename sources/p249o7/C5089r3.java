package p249o7;

/* renamed from: o7.r3 */
/* loaded from: classes.dex */
public final class C5089r3 {

    /* renamed from: a */
    public final java.lang.String f19970a;

    /* renamed from: b */
    public boolean f19971b;

    /* renamed from: c */
    public java.lang.String f19972c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.gms.measurement.internal.C1112c f19973d;

    public C5089r3(com.google.android.gms.measurement.internal.C1112c r1, java.lang.String r2) {
            r0 = this;
            r0.f19973d = r1
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f19970a = r2
            return
    }

    /* renamed from: a */
    public final java.lang.String m11416a() {
            r3 = this;
            boolean r0 = r3.f19971b
            if (r0 != 0) goto L16
            r0 = 1
            r3.f19971b = r0
            com.google.android.gms.measurement.internal.c r0 = r3.f19973d
            android.content.SharedPreferences r0 = r0.m3147p()
            java.lang.String r1 = r3.f19970a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r3.f19972c = r0
        L16:
            java.lang.String r0 = r3.f19972c
            return r0
    }

    /* renamed from: b */
    public final void m11417b(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.c r0 = r2.f19973d
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.f19970a
            r0.putString(r1, r3)
            r0.apply()
            r2.f19972c = r3
            return
    }
}
