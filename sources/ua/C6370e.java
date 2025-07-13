package ua;

/* renamed from: ua.e */
/* loaded from: classes.dex */
public class C6370e {

    /* renamed from: b */
    public static ua.C6370e f24837b;

    /* renamed from: c */
    public static final java.text.SimpleDateFormat f24838c = null;

    /* renamed from: a */
    public final android.content.SharedPreferences f24839a;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "dd/MM/yyyy z"
            r0.<init>(r1)
            ua.C6370e.f24838c = r0
            return
    }

    public C6370e(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "FirebaseAppHeartBeat"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            r2.f24839a = r0
            java.lang.String r0 = "FirebaseAppHeartBeatStorage"
            r3.getSharedPreferences(r0, r1)
            return
    }

    /* renamed from: a */
    public synchronized boolean m13016a(java.lang.String r5, long r6) {
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.f24839a     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L4e
            r1 = 1
            if (r0 == 0) goto L3f
            android.content.SharedPreferences r0 = r4.f24839a     // Catch: java.lang.Throwable -> L4e
            r2 = -1
            long r2 = r0.getLong(r5, r2)     // Catch: java.lang.Throwable -> L4e
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L4e
            java.text.SimpleDateFormat r3 = ua.C6370e.f24838c     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r3.format(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r3.format(r2)     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L4e
            r0 = r0 ^ r1
            if (r0 == 0) goto L3c
            android.content.SharedPreferences r0 = r4.f24839a     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences$Editor r5 = r0.putLong(r5, r6)     // Catch: java.lang.Throwable -> L4e
            r5.apply()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)
            return r1
        L3c:
            r5 = 0
            monitor-exit(r4)
            return r5
        L3f:
            android.content.SharedPreferences r0 = r4.f24839a     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences$Editor r5 = r0.putLong(r5, r6)     // Catch: java.lang.Throwable -> L4e
            r5.apply()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)
            return r1
        L4e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
