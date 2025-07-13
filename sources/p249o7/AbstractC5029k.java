package p249o7;

/* renamed from: o7.k */
/* loaded from: classes.dex */
public abstract class AbstractC5029k {

    /* renamed from: d */
    public static volatile android.os.Handler f19793d;

    /* renamed from: a */
    public final p249o7.InterfaceC5058n4 f19794a;

    /* renamed from: b */
    public final java.lang.Runnable f19795b;

    /* renamed from: c */
    public volatile long f19796c;

    public AbstractC5029k(p249o7.InterfaceC5058n4 r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f19794a = r2
            h6.a0 r0 = new h6.a0
            r0.<init>(r1, r2)
            r1.f19795b = r0
            return
    }

    /* renamed from: a */
    public final void m11284a() {
            r2 = this;
            r0 = 0
            r2.f19796c = r0
            android.os.Handler r0 = r2.m11286d()
            java.lang.Runnable r1 = r2.f19795b
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: b */
    public abstract void mo11119b();

    /* renamed from: c */
    public final void m11285c(long r4) {
            r3 = this;
            r3.m11284a()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L37
            o7.n4 r0 = r3.f19794a
            u6.c r0 = r0.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r3.f19796c = r0
            android.os.Handler r0 = r3.m11286d()
            java.lang.Runnable r1 = r3.f19795b
            boolean r0 = r0.postDelayed(r1, r4)
            if (r0 != 0) goto L37
            o7.n4 r0 = r3.f19794a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "Failed to schedule delayed post. time"
            r0.m11170d(r5, r4)
        L37:
            return
    }

    /* renamed from: d */
    public final android.os.Handler m11286d() {
            r3 = this;
            android.os.Handler r0 = p249o7.AbstractC5029k.f19793d
            if (r0 == 0) goto L7
            android.os.Handler r0 = p249o7.AbstractC5029k.f19793d
            return r0
        L7:
            java.lang.Class<o7.k> r0 = p249o7.AbstractC5029k.class
            monitor-enter(r0)
            android.os.Handler r1 = p249o7.AbstractC5029k.f19793d     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1f
            k7.j0 r1 = new k7.j0     // Catch: java.lang.Throwable -> L23
            o7.n4 r2 = r3.f19794a     // Catch: java.lang.Throwable -> L23
            android.content.Context r2 = r2.mo3161c()     // Catch: java.lang.Throwable -> L23
            android.os.Looper r2 = r2.getMainLooper()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            p249o7.AbstractC5029k.f19793d = r1     // Catch: java.lang.Throwable -> L23
        L1f:
            android.os.Handler r1 = p249o7.AbstractC5029k.f19793d     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }
}
