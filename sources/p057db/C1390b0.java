package p057db;

/* renamed from: db.b0 */
/* loaded from: classes.dex */
public final class C1390b0 {

    /* renamed from: a */
    public final android.content.SharedPreferences f7002a;

    /* renamed from: b */
    public final java.lang.String f7003b;

    /* renamed from: c */
    public final java.lang.String f7004c;

    /* renamed from: d */
    public final java.util.ArrayDeque<java.lang.String> f7005d;

    /* renamed from: e */
    public final java.util.concurrent.Executor f7006e;

    public C1390b0(android.content.SharedPreferences r1, java.lang.String r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r0.f7005d = r2
            r0.f7002a = r1
            java.lang.String r1 = "topic_operation_queue"
            r0.f7003b = r1
            java.lang.String r1 = ","
            r0.f7004c = r1
            r0.f7006e = r3
            return
    }

    /* renamed from: a */
    public static p057db.C1390b0 m3910a(android.content.SharedPreferences r4, java.lang.String r5, java.util.concurrent.Executor r6) {
            db.b0 r5 = new db.b0
            java.lang.String r0 = "topic_operation_queue"
            r5.<init>(r4, r0, r6)
            java.util.ArrayDeque<java.lang.String> r4 = r5.f7005d
            monitor-enter(r4)
            java.util.ArrayDeque<java.lang.String> r6 = r5.f7005d     // Catch: java.lang.Throwable -> L4e
            r6.clear()     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences r6 = r5.f7002a     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r5.f7003b     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r0, r1)     // Catch: java.lang.Throwable -> L4e
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L4c
            java.lang.String r0 = r5.f7004c     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L28
            goto L4c
        L28:
            java.lang.String r0 = r5.f7004c     // Catch: java.lang.Throwable -> L4e
            r1 = -1
            java.lang.String[] r6 = r6.split(r0, r1)     // Catch: java.lang.Throwable -> L4e
            int r0 = r6.length     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            if (r0 != 0) goto L3a
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch: java.lang.Throwable -> L4e
        L3a:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L4e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L49
            java.util.ArrayDeque<java.lang.String> r3 = r5.f7005d     // Catch: java.lang.Throwable -> L4e
            r3.add(r2)     // Catch: java.lang.Throwable -> L4e
        L49:
            int r1 = r1 + 1
            goto L3a
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            return r5
        L4e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            throw r5
    }
}
