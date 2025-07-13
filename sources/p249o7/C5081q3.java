package p249o7;

/* renamed from: o7.q3 */
/* loaded from: classes.dex */
public final class C5081q3 {

    /* renamed from: a */
    public final java.lang.String f19958a;

    /* renamed from: b */
    public final java.lang.String f19959b;

    /* renamed from: c */
    public final java.lang.String f19960c;

    /* renamed from: d */
    public final long f19961d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.measurement.internal.C1112c f19962e;

    public /* synthetic */ C5081q3(com.google.android.gms.measurement.internal.C1112c r3, long r4) {
            r2 = this;
            r2.f19962e = r3
            r2.<init>()
            java.lang.String r3 = "health_monitor"
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            com.google.android.gms.common.internal.C1101a.m3096a(r3)
            java.lang.String r3 = "health_monitor:start"
            r2.f19958a = r3
            java.lang.String r3 = "health_monitor:count"
            r2.f19959b = r3
            java.lang.String r3 = "health_monitor:value"
            r2.f19960c = r3
            r2.f19961d = r4
            return
    }

    /* renamed from: a */
    public final void m11413a() {
            r4 = this;
            com.google.android.gms.measurement.internal.c r0 = r4.f19962e
            r0.mo3183i()
            com.google.android.gms.measurement.internal.c r0 = r4.f19962e
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            com.google.android.gms.measurement.internal.c r2 = r4.f19962e
            android.content.SharedPreferences r2 = r2.m3147p()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = r4.f19959b
            r2.remove(r3)
            java.lang.String r3 = r4.f19960c
            r2.remove(r3)
            java.lang.String r3 = r4.f19958a
            r2.putLong(r3, r0)
            r2.apply()
            return
    }
}
