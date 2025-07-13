package gb;

/* renamed from: gb.a */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2311a implements java.util.concurrent.Callable {

    /* renamed from: a */
    public final /* synthetic */ int f10531a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f10532b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f10533c;

    public /* synthetic */ CallableC2311a(gb.C2313c r2, gb.C2318h r3) {
            r1 = this;
            r0 = 0
            r1.f10531a = r0
            r1.<init>()
            r1.f10532b = r2
            r1.f10533c = r3
            return
    }

    public /* synthetic */ CallableC2311a(p128hb.C2998c r2, p128hb.C2999d r3) {
            r1 = this;
            r0 = 1
            r1.f10531a = r0
            r1.<init>()
            r1.f10532b = r2
            r1.f10533c = r3
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r7 = this;
            int r0 = r7.f10531a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L32
        L7:
            java.lang.Object r0 = r7.f10532b
            gb.c r0 = (gb.C2313c) r0
            java.lang.Object r2 = r7.f10533c
            gb.h r2 = (gb.C2318h) r2
            com.google.firebase.remoteconfig.internal.b r0 = r0.f10542h
            java.lang.Object r3 = r0.f6652b
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r0.f6651a     // Catch: java.lang.Throwable -> L2f
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "fetch_timeout_in_seconds"
            long r5 = r2.f10545a     // Catch: java.lang.Throwable -> L2f
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "minimum_fetch_interval_in_seconds"
            long r5 = r2.f10546b     // Catch: java.lang.Throwable -> L2f
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2f
            r0.commit()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L32:
            java.lang.Object r0 = r7.f10532b
            hb.c r0 = (p128hb.C2998c) r0
            java.lang.Object r2 = r7.f10533c
            hb.d r2 = (p128hb.C2999d) r2
            hb.g r0 = r0.f12096b
            monitor-enter(r0)
            android.content.Context r3 = r0.f12115a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r0.f12116b     // Catch: java.lang.Throwable -> L5d
            r5 = 0
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "UTF-8"
            byte[] r2 = r2.getBytes(r4)     // Catch: java.lang.Throwable -> L58
            r3.write(r2)     // Catch: java.lang.Throwable -> L58
            r3.close()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)
            return r1
        L58:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L5d
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
