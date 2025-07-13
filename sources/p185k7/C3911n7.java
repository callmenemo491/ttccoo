package p185k7;

/* renamed from: k7.n7 */
/* loaded from: classes.dex */
public final class C3911n7 {

    /* renamed from: c */
    public static final p185k7.C3911n7 f16770c = null;

    /* renamed from: a */
    public final p185k7.InterfaceC3963r7 f16771a;

    /* renamed from: b */
    public final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, p185k7.InterfaceC3950q7<?>> f16772b;

    static {
            k7.n7 r0 = new k7.n7
            r0.<init>()
            p185k7.C3911n7.f16770c = r0
            return
    }

    public C3911n7() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f16772b = r0
            k7.x6 r0 = new k7.x6
            r0.<init>()
            r1.f16771a = r0
            return
    }

    /* renamed from: a */
    public final <T> p185k7.InterfaceC3950q7<T> m8848a(java.lang.Class<T> r9) {
            r8 = this;
            java.nio.charset.Charset r0 = p185k7.C3871k6.f16722a
            java.lang.String r0 = "messageType"
            java.util.Objects.requireNonNull(r9, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, k7.q7<?>> r0 = r8.f16772b
            java.lang.Object r0 = r0.get(r9)
            k7.q7 r0 = (p185k7.InterfaceC3950q7) r0
            if (r0 != 0) goto Ld1
            k7.r7 r0 = r8.f16771a
            k7.x6 r0 = (p185k7.C4040x6) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<k7.d6> r1 = p185k7.AbstractC3773d6.class
            java.lang.Class<?> r2 = p185k7.C3976s7.f16860a
            boolean r2 = r1.isAssignableFrom(r9)
            if (r2 != 0) goto L35
            java.lang.Class<?> r2 = p185k7.C3976s7.f16860a
            if (r2 == 0) goto L35
            boolean r2 = r2.isAssignableFrom(r9)
            if (r2 == 0) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            r9.<init>(r0)
            throw r9
        L35:
            k7.e7 r0 = r0.f16948a
            k7.d7 r2 = r0.mo8523a(r9)
            boolean r0 = r2.mo8210b()
            java.lang.String r3 = "Protobuf runtime is not correctly loaded."
            boolean r1 = r1.isAssignableFrom(r9)
            if (r0 == 0) goto L71
            if (r1 == 0) goto L5b
            k7.c8<?, ?> r0 = p185k7.C3976s7.f16863d
            k7.r5<?> r1 = p185k7.C3987t5.f16870a
            k7.r5<?> r1 = p185k7.C3987t5.f16870a
            k7.f7 r2 = r2.mo8209a()
            k7.j7 r3 = new k7.j7
            r3.<init>(r0, r1, r2)
        L58:
            r0 = r3
            goto Lc5
        L5b:
            k7.c8<?, ?> r0 = p185k7.C3976s7.f16861b
            k7.r5<?> r1 = p185k7.C3987t5.f16871b
            if (r1 == 0) goto L6b
            k7.f7 r2 = r2.mo8209a()
            k7.j7 r3 = new k7.j7
            r3.<init>(r0, r1, r2)
            goto L58
        L6b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L71:
            r0 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L93
            int r1 = r2.mo8211c()
            if (r1 != r5) goto L7d
            r0 = 1
        L7d:
            if (r0 == 0) goto L8a
            k7.k7 r0 = p185k7.C3885l7.f16738b
            k7.t6 r1 = p185k7.AbstractC3988t6.f16873b
            k7.c8<?, ?> r3 = p185k7.C3976s7.f16863d
            k7.r5<?> r4 = p185k7.C3987t5.f16870a
            k7.r5<?> r4 = p185k7.C3987t5.f16870a
            goto L90
        L8a:
            k7.k7 r0 = p185k7.C3885l7.f16738b
            k7.t6 r1 = p185k7.AbstractC3988t6.f16873b
            k7.c8<?, ?> r3 = p185k7.C3976s7.f16863d
        L90:
            k7.b7 r5 = p185k7.C3760c7.f16547b
            goto Lbc
        L93:
            int r1 = r2.mo8211c()
            if (r1 != r5) goto L9a
            r0 = 1
        L9a:
            if (r0 == 0) goto Lb4
            k7.k7 r0 = p185k7.C3885l7.f16737a
            k7.t6 r1 = p185k7.AbstractC3988t6.f16872a
            k7.c8<?, ?> r4 = p185k7.C3976s7.f16861b
            k7.r5<?> r5 = p185k7.C3987t5.f16871b
            if (r5 == 0) goto Lae
            k7.b7 r3 = p185k7.C3760c7.f16546a
            r7 = r3
            r6 = r5
            r3 = r0
            r5 = r4
            r4 = r1
            goto Lc1
        Lae:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lb4:
            k7.k7 r0 = p185k7.C3885l7.f16737a
            k7.t6 r1 = p185k7.AbstractC3988t6.f16872a
            k7.c8<?, ?> r3 = p185k7.C3976s7.f16862c
            k7.b7 r5 = p185k7.C3760c7.f16546a
        Lbc:
            r6 = r4
            r7 = r5
            r4 = r1
            r5 = r3
            r3 = r0
        Lc1:
            k7.i7 r0 = p185k7.C3844i7.m8664C(r2, r3, r4, r5, r6, r7)
        Lc5:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, k7.q7<?>> r1 = r8.f16772b
            java.lang.Object r9 = r1.putIfAbsent(r9, r0)
            k7.q7 r9 = (p185k7.InterfaceC3950q7) r9
            if (r9 != 0) goto Ld0
            goto Ld1
        Ld0:
            return r9
        Ld1:
            return r0
    }
}
