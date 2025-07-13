package ai;

/* renamed from: ai.m */
/* loaded from: classes.dex */
public final class C0113m {

    /* renamed from: b */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f377b = null;

    /* renamed from: c */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f378c = null;

    /* renamed from: d */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f379d = null;

    /* renamed from: e */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f380e = null;

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReferenceArray<ai.AbstractRunnableC0109i> f381a;
    private volatile /* synthetic */ int blockingTasksInBuffer;
    private volatile /* synthetic */ int consumerIndex;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask;
    private volatile /* synthetic */ int producerIndex;

    static {
            java.lang.Class<ai.m> r0 = ai.C0113m.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "lastScheduledTask"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            ai.C0113m.f377b = r1
            java.lang.String r1 = "producerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            ai.C0113m.f378c = r1
            java.lang.String r1 = "consumerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            ai.C0113m.f379d = r1
            java.lang.String r1 = "blockingTasksInBuffer"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            ai.C0113m.f380e = r0
            return
    }

    public C0113m() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f381a = r0
            r0 = 0
            r2.lastScheduledTask = r0
            r0 = 0
            r2.producerIndex = r0
            r2.consumerIndex = r0
            r2.blockingTasksInBuffer = r0
            return
    }

    /* renamed from: a */
    public final ai.AbstractRunnableC0109i m160a(ai.AbstractRunnableC0109i r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            ai.i r1 = r0.m161b(r1)
            return r1
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = ai.C0113m.f377b
            java.lang.Object r1 = r2.getAndSet(r0, r1)
            ai.i r1 = (ai.AbstractRunnableC0109i) r1
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            ai.i r1 = r0.m161b(r1)
            return r1
    }

    /* renamed from: b */
    public final ai.AbstractRunnableC0109i m161b(ai.AbstractRunnableC0109i r3) {
            r2 = this;
            ai.j r0 = r3.f370Z
            int r0 = r0.mo158s0()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L12
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ai.C0113m.f380e
            r0.incrementAndGet(r2)
        L12:
            int r0 = r2.m162c()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L1b
            return r3
        L1b:
            int r0 = r2.producerIndex
            r0 = r0 & r1
        L1e:
            java.util.concurrent.atomic.AtomicReferenceArray<ai.i> r1 = r2.f381a
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L2a
            java.lang.Thread.yield()
            goto L1e
        L2a:
            java.util.concurrent.atomic.AtomicReferenceArray<ai.i> r1 = r2.f381a
            r1.lazySet(r0, r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = ai.C0113m.f378c
            r3.incrementAndGet(r2)
            r3 = 0
            return r3
    }

    /* renamed from: c */
    public final int m162c() {
            r2 = this;
            int r0 = r2.producerIndex
            int r1 = r2.consumerIndex
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: d */
    public final int m163d() {
            r1 = this;
            java.lang.Object r0 = r1.lastScheduledTask
            if (r0 == 0) goto Lb
            int r0 = r1.m162c()
            int r0 = r0 + 1
            goto Lf
        Lb:
            int r0 = r1.m162c()
        Lf:
            return r0
    }

    /* renamed from: e */
    public final ai.AbstractRunnableC0109i m164e() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ai.C0113m.f377b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            ai.i r0 = (ai.AbstractRunnableC0109i) r0
            if (r0 != 0) goto Lf
            ai.i r0 = r2.m165f()
        Lf:
            return r0
    }

    /* renamed from: f */
    public final ai.AbstractRunnableC0109i m165f() {
            r5 = this;
        L0:
            int r0 = r5.consumerIndex
            int r1 = r5.producerIndex
            int r1 = r0 - r1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = ai.C0113m.f379d
            int r4 = r0 + 1
            boolean r0 = r3.compareAndSet(r5, r0, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray<ai.i> r0 = r5.f381a
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            ai.i r0 = (ai.AbstractRunnableC0109i) r0
            if (r0 != 0) goto L21
            goto L0
        L21:
            ai.j r1 = r0.f370Z
            int r1 = r1.mo158s0()
            r2 = 1
            if (r1 != r2) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L33
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ai.C0113m.f380e
            r1.decrementAndGet(r5)
        L33:
            return r0
    }

    /* renamed from: g */
    public final long m166g(ai.C0113m r9) {
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<ai.i> r2 = r9.f381a
        L6:
            r3 = 1
            if (r0 == r1) goto L3a
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L3a
        L10:
            java.lang.Object r5 = r2.get(r4)
            ai.i r5 = (ai.AbstractRunnableC0109i) r5
            if (r5 == 0) goto L37
            ai.j r6 = r5.f370Z
            int r6 = r6.mo158s0()
            r7 = 0
            if (r6 != r3) goto L22
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L37
            r3 = 0
            boolean r3 = r2.compareAndSet(r4, r5, r3)
            if (r3 == 0) goto L37
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ai.C0113m.f380e
            r0.decrementAndGet(r9)
            r8.m160a(r5, r7)
            r0 = -1
            return r0
        L37:
            int r0 = r0 + 1
            goto L6
        L3a:
            long r0 = r8.m167h(r9, r3)
            return r0
    }

    /* renamed from: h */
    public final long m167h(ai.C0113m r8, boolean r9) {
            r7 = this;
        L0:
            java.lang.Object r0 = r8.lastScheduledTask
            ai.i r0 = (ai.AbstractRunnableC0109i) r0
            r1 = -2
            if (r0 != 0) goto L9
            return r1
        L9:
            r3 = 0
            if (r9 == 0) goto L1a
            ai.j r4 = r0.f370Z
            int r4 = r4.mo158s0()
            r5 = 1
            if (r4 != r5) goto L16
            goto L17
        L16:
            r5 = 0
        L17:
            if (r5 != 0) goto L1a
            return r1
        L1a:
            ai.h r1 = ai.C0112l.f376e
            ai.f r1 = (ai.C0106f) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = java.lang.System.nanoTime()
            long r4 = r0.f369Y
            long r1 = r1 - r4
            long r4 = ai.C0112l.f372a
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L30
            long r4 = r4 - r1
            return r4
        L30:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ai.C0113m.f377b
            r2 = 0
            boolean r1 = r1.compareAndSet(r8, r0, r2)
            if (r1 == 0) goto L0
            r7.m160a(r0, r3)
            r8 = -1
            return r8
    }
}
