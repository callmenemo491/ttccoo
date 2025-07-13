package p459zh;

/* renamed from: zh.i */
/* loaded from: classes.dex */
public class C7343i {

    /* renamed from: Y */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28092Y = null;

    /* renamed from: Z */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28093Z = null;

    /* renamed from: a0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28094a0 = null;
    public volatile /* synthetic */ java.lang.Object _next;
    public volatile /* synthetic */ java.lang.Object _prev;
    private volatile /* synthetic */ java.lang.Object _removedRef;

    /* renamed from: zh.i$a */
    public static abstract class a extends p459zh.AbstractC7336b<p459zh.C7343i> {

        /* renamed from: b */
        public final p459zh.C7343i f28095b;

        /* renamed from: c */
        public p459zh.C7343i f28096c;

        public a(p459zh.C7343i r1) {
                r0 = this;
                r0.<init>()
                r0.f28095b = r1
                return
        }

        @Override // p459zh.AbstractC7336b
        /* renamed from: b */
        public void mo14412b(p459zh.C7343i r3, java.lang.Object r4) {
                r2 = this;
                zh.i r3 = (p459zh.C7343i) r3
                if (r4 != 0) goto L6
                r4 = 1
                goto L7
            L6:
                r4 = 0
            L7:
                if (r4 == 0) goto Lc
                zh.i r0 = r2.f28095b
                goto Le
            Lc:
                zh.i r0 = r2.f28096c
            Le:
                if (r0 == 0) goto L24
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28092Y
                boolean r3 = r1.compareAndSet(r3, r2, r0)
                if (r3 == 0) goto L24
                if (r4 == 0) goto L24
                zh.i r3 = r2.f28095b
                zh.i r4 = r2.f28096c
                p214m2.C4339q.m9704i(r4)
                r3.m14421f(r4)
            L24:
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<zh.i> r1 = p459zh.C7343i.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            p459zh.C7343i.f28092Y = r2
            java.lang.String r2 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            p459zh.C7343i.f28093Z = r2
            java.lang.String r2 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            p459zh.C7343i.f28094a0 = r0
            return
    }

    public C7343i() {
            r1 = this;
            r1.<init>()
            r1._next = r1
            r1._prev = r1
            r0 = 0
            r1._removedRef = r0
            return
    }

    /* renamed from: d */
    public final p459zh.C7343i m14420d(p459zh.AbstractC7347m r7) {
            r6 = this;
        L0:
            java.lang.Object r7 = r6._prev
            zh.i r7 = (p459zh.C7343i) r7
            r0 = 0
            r1 = r7
        L6:
            r2 = r0
        L7:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L18
            if (r7 != r1) goto Le
            return r1
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p459zh.C7343i.f28093Z
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L17
            goto L0
        L17:
            return r1
        L18:
            boolean r4 = r6.mo14419o()
            if (r4 == 0) goto L1f
            return r0
        L1f:
            if (r3 != 0) goto L22
            return r1
        L22:
            boolean r4 = r3 instanceof p459zh.AbstractC7347m
            if (r4 == 0) goto L2c
            zh.m r3 = (p459zh.AbstractC7347m) r3
            r3.mo14411a(r1)
            goto L0
        L2c:
            boolean r4 = r3 instanceof p459zh.C7348n
            if (r4 == 0) goto L46
            if (r2 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p459zh.C7343i.f28092Y
            zh.n r3 = (p459zh.C7348n) r3
            zh.i r3 = r3.f28107a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r1 = r2
            goto L6
        L41:
            java.lang.Object r1 = r1._prev
            zh.i r1 = (p459zh.C7343i) r1
            goto L7
        L46:
            r2 = r3
            zh.i r2 = (p459zh.C7343i) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L7
    }

    /* renamed from: f */
    public final void m14421f(p459zh.C7343i r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r3._prev
            zh.i r0 = (p459zh.C7343i) r0
            java.lang.Object r1 = r2.m14422j()
            if (r1 == r3) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28093Z
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            boolean r0 = r2.mo14419o()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.m14420d(r0)
        L1d:
            return
    }

    /* renamed from: j */
    public final java.lang.Object m14422j() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._next
            boolean r1 = r0 instanceof p459zh.AbstractC7347m
            if (r1 != 0) goto L7
            return r0
        L7:
            zh.m r0 = (p459zh.AbstractC7347m) r0
            r0.mo14411a(r2)
            goto L0
    }

    /* renamed from: m */
    public final p459zh.C7343i m14423m() {
            r2 = this;
            java.lang.Object r0 = r2.m14422j()
            boolean r1 = r0 instanceof p459zh.C7348n
            if (r1 == 0) goto Lc
            r1 = r0
            zh.n r1 = (p459zh.C7348n) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 != 0) goto L12
            zh.i r0 = (p459zh.C7343i) r0
            goto L14
        L12:
            zh.i r0 = r1.f28107a
        L14:
            return r0
    }

    /* renamed from: n */
    public final p459zh.C7343i m14424n() {
            r2 = this;
            r0 = 0
            zh.i r0 = r2.m14420d(r0)
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2._prev
            zh.i r0 = (p459zh.C7343i) r0
        Lb:
            boolean r1 = r0.mo14419o()
            if (r1 != 0) goto L12
            goto L17
        L12:
            java.lang.Object r0 = r0._prev
            zh.i r0 = (p459zh.C7343i) r0
            goto Lb
        L17:
            return r0
    }

    /* renamed from: o */
    public boolean mo14419o() {
            r1 = this;
            java.lang.Object r0 = r1.m14422j()
            boolean r0 = r0 instanceof p459zh.C7348n
            return r0
    }

    /* renamed from: p */
    public boolean m14425p() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.m14422j()
            boolean r1 = r0 instanceof p459zh.C7348n
            if (r1 == 0) goto Ld
            zh.n r0 = (p459zh.C7348n) r0
            zh.i r0 = r0.f28107a
            goto L31
        Ld:
            if (r0 != r4) goto L12
            zh.i r0 = (p459zh.C7343i) r0
            goto L31
        L12:
            r1 = r0
            zh.i r1 = (p459zh.C7343i) r1
            java.lang.Object r2 = r1._removedRef
            zh.n r2 = (p459zh.C7348n) r2
            if (r2 != 0) goto L25
            zh.n r2 = new zh.n
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p459zh.C7343i.f28094a0
            r3.lazySet(r1, r2)
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p459zh.C7343i.f28092Y
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L0
            r0 = 0
            r1.m14420d(r0)
        L31:
            if (r0 != 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
