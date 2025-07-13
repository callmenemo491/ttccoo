package p072e7;

/* renamed from: e7.i7 */
/* loaded from: classes.dex */
public final class C1640i7 {

    /* renamed from: c */
    public static final p072e7.C1640i7 f7650c = null;

    /* renamed from: a */
    public final p072e7.InterfaceC1680m7 f7651a;

    /* renamed from: b */
    public final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, p072e7.InterfaceC1670l7<?>> f7652b;

    static {
            e7.i7 r0 = new e7.i7
            r0.<init>()
            p072e7.C1640i7.f7650c = r0
            return
    }

    public C1640i7() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f7652b = r0
            e7.s6 r0 = new e7.s6
            r0.<init>()
            r1.f7651a = r0
            return
    }

    /* renamed from: a */
    public final <T> p072e7.InterfaceC1670l7<T> m4233a(java.lang.Class<T> r9) {
            r8 = this;
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            java.lang.String r0 = "messageType"
            java.util.Objects.requireNonNull(r9, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, e7.l7<?>> r0 = r8.f7652b
            java.lang.Object r0 = r0.get(r9)
            e7.l7 r0 = (p072e7.InterfaceC1670l7) r0
            if (r0 != 0) goto Ld1
            e7.m7 r0 = r8.f7651a
            e7.s6 r0 = (p072e7.C1739s6) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<e7.x5> r1 = p072e7.AbstractC1783x5.class
            java.lang.Class<?> r2 = p072e7.C1690n7.f7703a
            boolean r2 = r1.isAssignableFrom(r9)
            if (r2 != 0) goto L35
            java.lang.Class<?> r2 = p072e7.C1690n7.f7703a
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
            e7.z6 r0 = r0.f7779a
            e7.y6 r2 = r0.mo4418a(r9)
            boolean r0 = r2.mo4318b()
            java.lang.String r3 = "Protobuf runtime is not correctly loaded."
            boolean r1 = r1.isAssignableFrom(r9)
            if (r0 == 0) goto L71
            if (r1 == 0) goto L5b
            e7.z7<?, ?> r0 = p072e7.C1690n7.f7706d
            e7.o5<?> r1 = p072e7.C1718q5.f7759a
            e7.o5<?> r1 = p072e7.C1718q5.f7759a
            e7.a7 r2 = r2.mo4317a()
            e7.e7 r3 = new e7.e7
            r3.<init>(r0, r1, r2)
        L58:
            r0 = r3
            goto Lc5
        L5b:
            e7.z7<?, ?> r0 = p072e7.C1690n7.f7704b
            e7.o5<?> r1 = p072e7.C1718q5.f7760b
            if (r1 == 0) goto L6b
            e7.a7 r2 = r2.mo4317a()
            e7.e7 r3 = new e7.e7
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
            int r1 = r2.mo4319c()
            if (r1 != r5) goto L7d
            r0 = 1
        L7d:
            if (r0 == 0) goto L8a
            e7.f7 r0 = p072e7.C1620g7.f7571b
            e7.o6 r1 = p072e7.AbstractC1699o6.f7715b
            e7.z7<?, ?> r3 = p072e7.C1690n7.f7706d
            e7.o5<?> r4 = p072e7.C1718q5.f7759a
            e7.o5<?> r4 = p072e7.C1718q5.f7759a
            goto L90
        L8a:
            e7.f7 r0 = p072e7.C1620g7.f7571b
            e7.o6 r1 = p072e7.AbstractC1699o6.f7715b
            e7.z7<?, ?> r3 = p072e7.C1690n7.f7706d
        L90:
            e7.v6 r5 = p072e7.C1784x6.f7839b
            goto Lbc
        L93:
            int r1 = r2.mo4319c()
            if (r1 != r5) goto L9a
            r0 = 1
        L9a:
            if (r0 == 0) goto Lb4
            e7.f7 r0 = p072e7.C1620g7.f7570a
            e7.o6 r1 = p072e7.AbstractC1699o6.f7714a
            e7.z7<?, ?> r4 = p072e7.C1690n7.f7704b
            e7.o5<?> r5 = p072e7.C1718q5.f7760b
            if (r5 == 0) goto Lae
            e7.v6 r3 = p072e7.C1784x6.f7838a
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
            e7.f7 r0 = p072e7.C1620g7.f7570a
            e7.o6 r1 = p072e7.AbstractC1699o6.f7714a
            e7.z7<?, ?> r3 = p072e7.C1690n7.f7705c
            e7.v6 r5 = p072e7.C1784x6.f7838a
        Lbc:
            r6 = r4
            r7 = r5
            r4 = r1
            r5 = r3
            r3 = r0
        Lc1:
            e7.d7 r0 = p072e7.C1590d7.m4152n(r2, r3, r4, r5, r6, r7)
        Lc5:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, e7.l7<?>> r1 = r8.f7652b
            java.lang.Object r9 = r1.putIfAbsent(r9, r0)
            e7.l7 r9 = (p072e7.InterfaceC1670l7) r9
            if (r9 != 0) goto Ld0
            goto Ld1
        Ld0:
            return r9
        Ld1:
            return r0
    }
}
