package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.z */
/* loaded from: classes.dex */
public class C1181z {

    /* renamed from: a */
    public static java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.C1180y> f6148a;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.material.datepicker.C1181z.f6148a = r0
            return
    }

    /* renamed from: a */
    public static long m3440a(long r1) {
            java.util.Calendar r0 = m3444e()
            r0.setTimeInMillis(r1)
            java.util.Calendar r1 = m3441b(r0)
            long r1 = r1.getTimeInMillis()
            return r1
    }

    /* renamed from: b */
    public static java.util.Calendar m3441b(java.util.Calendar r4) {
            java.util.Calendar r4 = m3445f(r4)
            java.util.Calendar r0 = m3444e()
            r1 = 1
            int r1 = r4.get(r1)
            r2 = 2
            int r2 = r4.get(r2)
            r3 = 5
            int r4 = r4.get(r3)
            r0.set(r1, r2, r4)
            return r0
    }

    /* renamed from: c */
    public static java.util.TimeZone m3442c() {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            return r0
    }

    /* renamed from: d */
    public static java.util.Calendar m3443d() {
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.y> r0 = com.google.android.material.datepicker.C1181z.f6148a
            java.lang.Object r0 = r0.get()
            com.google.android.material.datepicker.y r0 = (com.google.android.material.datepicker.C1180y) r0
            if (r0 != 0) goto Lc
            com.google.android.material.datepicker.y r0 = com.google.android.material.datepicker.C1180y.f6145c
        Lc:
            java.util.TimeZone r1 = r0.f6147b
            if (r1 != 0) goto L15
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            goto L19
        L15:
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
        L19:
            java.lang.Long r0 = r0.f6146a
            if (r0 == 0) goto L24
            long r2 = r0.longValue()
            r1.setTimeInMillis(r2)
        L24:
            r0 = 11
            r2 = 0
            r1.set(r0, r2)
            r0 = 12
            r1.set(r0, r2)
            r0 = 13
            r1.set(r0, r2)
            r0 = 14
            r1.set(r0, r2)
            java.util.TimeZone r0 = m3442c()
            r1.setTimeZone(r0)
            return r1
    }

    /* renamed from: e */
    public static java.util.Calendar m3444e() {
            r0 = 0
            java.util.Calendar r0 = m3445f(r0)
            return r0
    }

    /* renamed from: f */
    public static java.util.Calendar m3445f(java.util.Calendar r3) {
            java.util.TimeZone r0 = m3442c()
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            if (r3 != 0) goto Le
            r0.clear()
            goto L15
        Le:
            long r1 = r3.getTimeInMillis()
            r0.setTimeInMillis(r1)
        L15:
            return r0
    }
}
