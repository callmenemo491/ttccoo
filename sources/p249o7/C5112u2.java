package p249o7;

/* renamed from: o7.u2 */
/* loaded from: classes.dex */
public final class C5112u2<V> {

    /* renamed from: g */
    public static final java.lang.Object f20017g = null;

    /* renamed from: a */
    public final java.lang.String f20018a;

    /* renamed from: b */
    public final p249o7.InterfaceC5104t2<V> f20019b;

    /* renamed from: c */
    public final V f20020c;

    /* renamed from: d */
    public final V f20021d;

    /* renamed from: e */
    public final java.lang.Object f20022e;

    /* renamed from: f */
    public volatile V f20023f;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p249o7.C5112u2.f20017g = r0
            return
    }

    public /* synthetic */ C5112u2(java.lang.String r2, java.lang.Object r3, java.lang.Object r4, p249o7.InterfaceC5104t2 r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f20022e = r0
            r0 = 0
            r1.f20023f = r0
            r1.f20018a = r2
            r1.f20020c = r3
            r1.f20021d = r4
            r1.f20019b = r5
            return
    }

    /* renamed from: a */
    public final V m11421a(V r4) {
            r3 = this;
            java.lang.Object r0 = r3.f20022e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L7
            return r4
        L7:
            v1.b r4 = p185k7.C3836i.f16668a
            if (r4 == 0) goto L69
            java.lang.Object r4 = p249o7.C5112u2.f20017g
            monitor-enter(r4)
            boolean r0 = p367v1.C6488b.m13179l()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L1f
            V r0 = r3.f20023f     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L1b
            V r0 = r3.f20020c     // Catch: java.lang.Throwable -> L66
            goto L1d
        L1b:
            V r0 = r3.f20023f     // Catch: java.lang.Throwable -> L66
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            return r0
        L1f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            java.util.List<o7.u2<?>> r4 = p249o7.C5120v2.f20082a     // Catch: java.lang.SecurityException -> L53
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L53
        L26:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L53
            if (r0 == 0) goto L54
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L53
            o7.u2 r0 = (p249o7.C5112u2) r0     // Catch: java.lang.SecurityException -> L53
            boolean r1 = p367v1.C6488b.m13179l()     // Catch: java.lang.SecurityException -> L53
            if (r1 != 0) goto L4b
            r1 = 0
            o7.t2<V> r2 = r0.f20019b     // Catch: java.lang.IllegalStateException -> L41 java.lang.SecurityException -> L53
            if (r2 == 0) goto L41
            java.lang.Object r1 = r2.mo11086a()     // Catch: java.lang.IllegalStateException -> L41 java.lang.SecurityException -> L53
        L41:
            java.lang.Object r2 = p249o7.C5112u2.f20017g     // Catch: java.lang.SecurityException -> L53
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L53
            r0.f20023f = r1     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            goto L26
        L48:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r4     // Catch: java.lang.SecurityException -> L53
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L53
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L53
            throw r4     // Catch: java.lang.SecurityException -> L53
        L53:
        L54:
            o7.t2<V> r4 = r3.f20019b
            if (r4 != 0) goto L5b
            V r4 = r3.f20020c
            return r4
        L5b:
            java.lang.Object r4 = r4.mo11086a()     // Catch: java.lang.IllegalStateException -> L60 java.lang.SecurityException -> L63
            return r4
        L60:
            V r4 = r3.f20020c
            return r4
        L63:
            V r4 = r3.f20020c
            return r4
        L66:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            throw r0
        L69:
            V r4 = r3.f20020c
            return r4
        L6c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r4
    }
}
