package p260oi;

/* renamed from: oi.v */
/* loaded from: classes.dex */
public final class C5300v {

    /* renamed from: a */
    public static final p260oi.C5299u f20543a = null;

    /* renamed from: b */
    public static final int f20544b = 0;

    /* renamed from: c */
    public static final java.util.concurrent.atomic.AtomicReference<okio.Segment>[] f20545c = null;

    /* renamed from: d */
    public static final p260oi.C5300v f20546d = null;

    static {
            oi.v r0 = new oi.v
            r0.<init>()
            p260oi.C5300v.f20546d = r0
            oi.u r0 = new oi.u
            r7 = 0
            byte[] r2 = new byte[r7]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            p260oi.C5300v.f20543a = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            p260oi.C5300v.f20544b = r0
            java.util.concurrent.atomic.AtomicReference[] r1 = new java.util.concurrent.atomic.AtomicReference[r0]
        L2a:
            if (r7 >= r0) goto L36
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1[r7] = r2
            int r7 = r7 + 1
            goto L2a
        L36:
            p260oi.C5300v.f20545c = r1
            return
    }

    public C5300v() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: b */
    public static final void m11608b(p260oi.C5299u r5) {
            oi.u r0 = r5.f20541f
            r1 = 0
            if (r0 != 0) goto Lb
            oi.u r0 = r5.f20542g
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L41
            boolean r0 = r5.f20539d
            if (r0 == 0) goto L13
            return
        L13:
            oi.v r0 = p260oi.C5300v.f20546d
            java.util.concurrent.atomic.AtomicReference r0 = r0.m11610a()
            java.lang.Object r2 = r0.get()
            oi.u r2 = (p260oi.C5299u) r2
            oi.u r3 = p260oi.C5300v.f20543a
            if (r2 != r3) goto L24
            return
        L24:
            if (r2 == 0) goto L29
            int r3 = r2.f20538c
            goto L2a
        L29:
            r3 = 0
        L2a:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 < r4) goto L2f
            return
        L2f:
            r5.f20541f = r2
            r5.f20537b = r1
            int r3 = r3 + 8192
            r5.f20538c = r3
            boolean r0 = r0.compareAndSet(r2, r5)
            if (r0 != 0) goto L40
            r0 = 0
            r5.f20541f = r0
        L40:
            return
        L41:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    /* renamed from: c */
    public static final p260oi.C5299u m11609c() {
            oi.v r0 = p260oi.C5300v.f20546d
            java.util.concurrent.atomic.AtomicReference r0 = r0.m11610a()
            oi.u r1 = p260oi.C5300v.f20543a
            java.lang.Object r2 = r0.getAndSet(r1)
            oi.u r2 = (p260oi.C5299u) r2
            if (r2 != r1) goto L16
            oi.u r0 = new oi.u
            r0.<init>()
            return r0
        L16:
            r1 = 0
            if (r2 != 0) goto L22
            r0.set(r1)
            oi.u r0 = new oi.u
            r0.<init>()
            return r0
        L22:
            oi.u r3 = r2.f20541f
            r0.set(r3)
            r2.f20541f = r1
            r0 = 0
            r2.f20538c = r0
            return r2
    }

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReference<p260oi.C5299u> m11610a() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            p214m2.C4339q.m9705j(r0, r1)
            long r0 = r0.getId()
            int r2 = p260oi.C5300v.f20544b
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r1 = (int) r0
            java.util.concurrent.atomic.AtomicReference<okio.Segment>[] r0 = p260oi.C5300v.f20545c
            r0 = r0[r1]
            return r0
    }
}
