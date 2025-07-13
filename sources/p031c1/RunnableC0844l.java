package p031c1;

/* renamed from: c1.l */
/* loaded from: classes.dex */
public class RunnableC0844l implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4583Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f4584Z;

    /* renamed from: a0 */
    public final /* synthetic */ p016b.C0652b f4585a0;

    /* renamed from: b0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4586b0;

    public RunnableC0844l(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, java.lang.String r3, p016b.C0652b r4) {
            r0 = this;
            r0.f4586b0 = r1
            r0.f4583Y = r2
            r0.f4584Z = r3
            r0.f4585a0 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            c1.a$l r0 = r3.f4583Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r3.f4586b0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r0 = r1.get(r0)
            c1.a$c r0 = (p031c1.AbstractServiceC0833a.c) r0
            if (r0 != 0) goto L2b
            java.lang.String r0 = "getMediaItem for callback that isn't registered id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f4584Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MBServiceCompat"
            android.util.Log.w(r1, r0)
            return
        L2b:
            c1.a$k r0 = r3.f4586b0
            c1.a r0 = r0.f4553a
            b.b r1 = r3.f4585a0
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            r2 = -1
            r1.m2197b(r2, r0)
            return
    }
}
