package p459zh;

/* renamed from: zh.k */
/* loaded from: classes.dex */
public final class C7345k<E> {

    /* renamed from: e */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28098e = null;

    /* renamed from: f */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f28099f = null;

    /* renamed from: g */
    public static final p459zh.C7350p f28100g = null;
    private volatile /* synthetic */ java.lang.Object _next;
    private volatile /* synthetic */ long _state;

    /* renamed from: a */
    public final int f28101a;

    /* renamed from: b */
    public final boolean f28102b;

    /* renamed from: c */
    public final int f28103c;

    /* renamed from: d */
    public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f28104d;

    /* renamed from: zh.k$a */
    public static final class a {

        /* renamed from: a */
        public final int f28105a;

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.f28105a = r1
                return
        }
    }

    static {
            java.lang.Class<zh.k> r0 = p459zh.C7345k.class
            zh.p r1 = new zh.p
            java.lang.String r2 = "REMOVE_FROZEN"
            r1.<init>(r2)
            p459zh.C7345k.f28100g = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p459zh.C7345k.f28098e = r1
            java.lang.String r1 = "_state"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            p459zh.C7345k.f28099f = r0
            return
    }

    public C7345k(int r5, boolean r6) {
            r4 = this;
            r4.<init>()
            r4.f28101a = r5
            r4.f28102b = r6
            int r6 = r5 + (-1)
            r4.f28103c = r6
            r0 = 0
            r4._next = r0
            r0 = 0
            r4._state = r0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r5)
            r4.f28104d = r0
            r0 = 0
            r1 = 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r6 > r2) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.String r3 = "Check failed."
            if (r2 == 0) goto L38
            r5 = r5 & r6
            if (r5 != 0) goto L2b
            r0 = 1
        L2b:
            if (r0 == 0) goto L2e
            return
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r3.toString()
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r3.toString()
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: a */
    public final int m14430a(E r16) {
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L17
            r4 = 2
        L17:
            return r4
        L18:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r11 = r6.f28103c
            int r5 = r12 + 2
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L33
            return r4
        L33:
            boolean r5 = r6.f28102b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f28104d
            r14 = r12 & r11
            java.lang.Object r5 = r5.get(r14)
            if (r5 == 0) goto L52
            int r0 = r6.f28101a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L51
            int r12 = r12 - r1
            r1 = r12 & r13
            int r0 = r0 >> 1
            if (r1 <= r0) goto L3
        L51:
            return r4
        L52:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p459zh.C7345k.f28099f
            r13 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r13 = r13 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r13 | r0
            r0 = r4
            r1 = r15
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f28104d
            r1 = r12 & r11
            r0.set(r1, r7)
            r0 = r6
        L73:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L7f
            goto La2
        L7f:
            zh.k r0 = r0.m14434e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f28104d
            int r2 = r0.f28103c
            r2 = r2 & r12
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof p459zh.C7345k.a
            if (r2 == 0) goto L9f
            zh.k$a r1 = (p459zh.C7345k.a) r1
            int r1 = r1.f28105a
            if (r1 != r12) goto L9f
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f28104d
            int r2 = r0.f28103c
            r2 = r2 & r12
            r1.set(r2, r7)
            goto La0
        L9f:
            r0 = 0
        La0:
            if (r0 != 0) goto L73
        La2:
            return r10
    }

    /* renamed from: b */
    public final boolean m14431b() {
            r10 = this;
        L0:
            long r2 = r10._state
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r4 = r2 & r0
            r6 = 1
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto Le
            return r6
        Le:
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r2
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L17
            r0 = 0
            return r0
        L17:
            long r4 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p459zh.C7345k.f28099f
            r1 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            return r6
    }

    /* renamed from: c */
    public final int m14432c() {
            r6 = this;
            long r0 = r6._state
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            r4 = 0
            long r2 = r2 >> r4
            int r3 = (int) r2
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r4
            r2 = 30
            long r0 = r0 >> r2
            int r1 = (int) r0
            int r1 = r1 - r3
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            return r0
    }

    /* renamed from: d */
    public final boolean m14433d() {
            r7 = this;
            long r0 = r7._state
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            r4 = 0
            long r2 = r2 >> r4
            int r3 = (int) r2
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r5
            r2 = 30
            long r0 = r0 >> r2
            int r1 = (int) r0
            if (r3 != r1) goto L16
            r4 = 1
        L16:
            return r4
    }

    /* renamed from: e */
    public final p459zh.C7345k<E> m14434e() {
            r10 = this;
        L0:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto Ld
            goto L1a
        Ld:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p459zh.C7345k.f28099f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r2 = r6
        L1a:
            java.lang.Object r0 = r10._next
            zh.k r0 = (p459zh.C7345k) r0
            if (r0 == 0) goto L21
            return r0
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p459zh.C7345k.f28098e
            r1 = 0
            zh.k r4 = new zh.k
            int r5 = r10.f28101a
            int r5 = r5 * 2
            boolean r6 = r10.f28102b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r6 = (int) r5
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L40:
            int r7 = r10.f28103c
            r8 = r6 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L5f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f28104d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L54
            zh.k$a r7 = new zh.k$a
            r7.<init>(r6)
        L54:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f28104d
            int r9 = r4.f28103c
            r9 = r9 & r6
            r8.set(r9, r7)
            int r6 = r6 + 1
            goto L40
        L5f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L1a
    }

    /* renamed from: f */
    public final java.lang.Object m14435f() {
            r29 = this;
            r6 = r29
        L2:
            long r2 = r6._state
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r2 & r7
            r9 = 0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L11
            zh.p r0 = p459zh.C7345k.f28100g
            return r0
        L11:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r2 & r11
            r13 = 0
            long r0 = r0 >> r13
            int r14 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r2
            r4 = 30
            long r0 = r0 >> r4
            int r1 = (int) r0
            int r0 = r6.f28103c
            r1 = r1 & r0
            r0 = r0 & r14
            r15 = 0
            if (r1 != r0) goto L2b
            return r15
        L2b:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.f28104d
            java.lang.Object r4 = r1.get(r0)
            if (r4 != 0) goto L38
            boolean r0 = r6.f28102b
            if (r0 == 0) goto L2
            return r15
        L38:
            boolean r0 = r4 instanceof p459zh.C7345k.a
            if (r0 == 0) goto L3d
            return r15
        L3d:
            int r0 = r14 + 1
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p459zh.C7345k.f28099f
            r16 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r16
            long r9 = (long) r0
            long r9 = r9 << r13
            long r18 = r18 | r9
            r0 = r1
            r1 = r29
            r22 = r4
            r4 = r18
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L64
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f28104d
            int r1 = r6.f28103c
            r1 = r1 & r14
            r0.set(r1, r15)
            return r22
        L64:
            boolean r0 = r6.f28102b
            if (r0 != 0) goto L69
            goto L2
        L69:
            r0 = r6
        L6a:
            long r1 = r0._state
            long r3 = r1 & r11
            long r3 = r3 >> r13
            int r4 = (int) r3
            long r18 = r1 & r7
            r20 = 0
            int r3 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r3 == 0) goto L7d
            zh.k r0 = r0.m14434e()
            goto L96
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r23 = p459zh.C7345k.f28099f
            long r18 = r1 & r16
            long r27 = r18 | r9
            r24 = r0
            r25 = r1
            boolean r1 = r23.compareAndSet(r24, r25, r27)
            if (r1 == 0) goto L6a
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f28104d
            int r0 = r0.f28103c
            r0 = r0 & r4
            r1.set(r0, r15)
            r0 = r15
        L96:
            if (r0 != 0) goto L6a
            return r22
    }
}
