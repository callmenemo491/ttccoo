package com.google.firebase.remoteconfig.internal;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
/* loaded from: classes.dex */
public class C1248b {

    /* renamed from: d */
    public static final java.util.Date f6649d = null;

    /* renamed from: e */
    public static final java.util.Date f6650e = null;

    /* renamed from: a */
    public final android.content.SharedPreferences f6651a;

    /* renamed from: b */
    public final java.lang.Object f6652b;

    /* renamed from: c */
    public final java.lang.Object f6653c;

    /* renamed from: com.google.firebase.remoteconfig.internal.b$a */
    public static class a {

        /* renamed from: a */
        public int f6654a;

        /* renamed from: b */
        public java.util.Date f6655b;

        public a(int r1, java.util.Date r2) {
                r0 = this;
                r0.<init>()
                r0.f6654a = r1
                r0.f6655b = r2
                return
        }
    }

    static {
            java.util.Date r0 = new java.util.Date
            r1 = -1
            r0.<init>(r1)
            com.google.firebase.remoteconfig.internal.C1248b.f6649d = r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            com.google.firebase.remoteconfig.internal.C1248b.f6650e = r0
            return
    }

    public C1248b(android.content.SharedPreferences r1) {
            r0 = this;
            r0.<init>()
            r0.f6651a = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f6652b = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f6653c = r1
            return
    }

    /* renamed from: a */
    public com.google.firebase.remoteconfig.internal.C1248b.a m3680a() {
            r8 = this;
            java.lang.Object r0 = r8.f6653c
            monitor-enter(r0)
            com.google.firebase.remoteconfig.internal.b$a r1 = new com.google.firebase.remoteconfig.internal.b$a     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences r2 = r8.f6651a     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "num_failed_fetches"
            r4 = 0
            int r2 = r2.getInt(r3, r4)     // Catch: java.lang.Throwable -> L22
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences r4 = r8.f6651a     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "backoff_end_time_in_millis"
            r6 = -1
            long r4 = r4.getLong(r5, r6)     // Catch: java.lang.Throwable -> L22
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L22
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    /* renamed from: b */
    public void m3681b(int r5, java.util.Date r6) {
            r4 = this;
            java.lang.Object r0 = r4.f6653c
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.f6651a     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "num_failed_fetches"
            android.content.SharedPreferences$Editor r5 = r1.putInt(r2, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "backoff_end_time_in_millis"
            long r2 = r6.getTime()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences$Editor r5 = r5.putLong(r1, r2)     // Catch: java.lang.Throwable -> L1e
            r5.apply()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r5
    }
}
