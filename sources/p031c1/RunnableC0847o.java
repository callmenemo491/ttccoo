package p031c1;

/* renamed from: c1.o */
/* loaded from: classes.dex */
public class RunnableC0847o implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4595Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f4596Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.os.Bundle f4597a0;

    /* renamed from: b0 */
    public final /* synthetic */ p016b.C0652b f4598b0;

    /* renamed from: c0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4599c0;

    public RunnableC0847o(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, java.lang.String r3, android.os.Bundle r4, p016b.C0652b r5) {
            r0 = this;
            r0.f4599c0 = r1
            r0.f4595Y = r2
            r0.f4596Z = r3
            r0.f4597a0 = r4
            r0.f4598b0 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r6 = this;
            c1.a$l r0 = r6.f4595Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r6.f4599c0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r0 = r1.get(r0)
            c1.a$c r0 = (p031c1.AbstractServiceC0833a.c) r0
            if (r0 != 0) goto L2b
            java.lang.String r0 = "search for callback that isn't registered query="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r6.f4596Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MBServiceCompat"
            android.util.Log.w(r1, r0)
            return
        L2b:
            c1.a$k r0 = r6.f4599c0
            c1.a r0 = r0.f4553a
            java.lang.String r1 = r6.f4596Z
            android.os.Bundle r2 = r6.f4597a0
            b.b r3 = r6.f4598b0
            java.util.Objects.requireNonNull(r0)
            c1.b r4 = new c1.b
            r4.<init>(r0, r1, r3)
            qd.a r0 = (p292qd.ServiceC5617a) r0
            java.lang.String r3 = "query"
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r3 = "result"
            p214m2.C4339q.m9706k(r4, r3)
            rd.c r3 = r0.f21815g0
            if (r3 == 0) goto L6e
            qd.b r5 = new qd.b
            r5.<init>(r0, r1, r2, r4)
            boolean r0 = r3.mo12191o(r5)
            if (r0 != 0) goto L5b
            r4.mo2508a()
        L5b:
            boolean r0 = r4.m2509b()
            if (r0 == 0) goto L62
            return
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "onSearch must call detach() or sendResult() before returning for query="
            java.lang.String r1 = p064e.C1493g.m4049a(r2, r1)
            r0.<init>(r1)
            throw r0
        L6e:
            java.lang.String r0 = "mediaSource"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }
}
