package p123h6;

/* renamed from: h6.s */
/* loaded from: classes.dex */
public class C2512s {

    /* renamed from: a */
    public final p123h6.C2489b f11332a;

    /* renamed from: b */
    public final java.lang.String f11333b;

    /* renamed from: c */
    public p123h6.InterfaceC2508o f11334c;

    /* renamed from: d */
    public final java.util.List<p123h6.C2510q> f11335d;

    public C2512s(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            p123h6.C2487a.m6366e(r4)
            r3.f11333b = r4
            h6.b r4 = new h6.b
            java.lang.String r0 = "MediaControlChannel"
            r4.<init>(r0)
            r3.f11332a = r4
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1f
            goto L2b
        L1f:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "[%s] "
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L2b:
            r4.f11255c = r0
        L2d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = java.util.Collections.synchronizedList(r4)
            r3.f11335d = r4
            return
    }

    /* renamed from: a */
    public final long m6415a() {
            r4 = this;
            h6.o r0 = r4.f11334c
            if (r0 != 0) goto L17
            h6.b r0 = r4.f11332a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f11253a
            java.lang.String r3 = "Attempt to generate requestId without a sink"
            java.lang.String r0 = r0.m6380e(r3, r1)
            android.util.Log.e(r2, r0)
            r0 = 0
            goto L1f
        L17:
            e6.q r0 = (p071e6.C1542q) r0
            java.util.concurrent.atomic.AtomicLong r0 = r0.f7466b
            long r0 = r0.getAndIncrement()
        L1f:
            return r0
    }

    /* renamed from: b */
    public final void m6416b(java.lang.String r6, long r7, java.lang.String r9) {
            r5 = this;
            h6.o r9 = r5.f11334c
            r0 = 0
            if (r9 != 0) goto L15
            h6.b r6 = r5.f11332a
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = r6.f11253a
            java.lang.String r9 = "Attempt to send text message without a sink"
            java.lang.String r6 = r6.m6380e(r9, r7)
            android.util.Log.e(r8, r6)
            goto L57
        L15:
            java.lang.String r1 = r5.f11333b
            e6.q r9 = (p071e6.C1542q) r9
            com.google.android.gms.cast.e r2 = r9.f7465a
            if (r2 == 0) goto L77
            com.google.android.gms.cast.d r2 = (com.google.android.gms.cast.C1060d) r2
            p123h6.C2487a.m6366e(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L6f
            int r3 = r6.length()
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r3 > r4) goto L58
            m6.k$a r0 = p218m6.AbstractC4398k.m9834a()
            c6.f0 r3 = new c6.f0
            r4 = 1
            r3.<init>(r2, r1, r6, r4)
            r0.f17961a = r3
            r6 = 8405(0x20d5, float:1.1778E-41)
            r0.f17964d = r6
            m6.k r6 = r0.m9835a()
            s7.i r6 = r2.m9328d(r4, r6)
            e6.p r0 = new e6.p
            r0.<init>(r9, r7)
            s7.q r6 = (p327s7.C5993q) r6
            java.util.Objects.requireNonNull(r6)
            java.util.concurrent.Executor r7 = p327s7.C5987k.f23076a
            r6.mo12445c(r7, r0)
        L57:
            return
        L58:
            h6.b r6 = com.google.android.gms.cast.C1060d.f5412F
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = r6.f11253a
            java.lang.String r9 = "Message send failed. Message exceeds maximum size"
            java.lang.String r6 = r6.m6380e(r9, r7)
            android.util.Log.w(r8, r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Message exceeds maximum size524288"
            r6.<init>(r7)
            throw r6
        L6f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The message payload cannot be null or empty"
            r6.<init>(r7)
            throw r6
        L77:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Device is not connected"
            r6.<init>(r7)
            throw r6
    }
}
