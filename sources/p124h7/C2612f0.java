package p124h7;

/* renamed from: h7.f0 */
/* loaded from: classes.dex */
public final class C2612f0 {

    /* renamed from: c */
    public static final p124h7.C2612f0 f11504c = null;

    /* renamed from: a */
    public final p124h7.InterfaceC2684j0 f11505a;

    /* renamed from: b */
    public final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, p124h7.InterfaceC2666i0<?>> f11506b;

    static {
            h7.f0 r0 = new h7.f0
            r0.<init>()
            p124h7.C2612f0.f11504c = r0
            return
    }

    public C2612f0() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f11506b = r0
            h7.q r0 = new h7.q
            r0.<init>()
            r1.f11505a = r0
            return
    }

    /* renamed from: a */
    public final <T> p124h7.InterfaceC2666i0<T> m6688a(java.lang.Class<T> r9) {
            r8 = this;
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            java.lang.String r0 = "messageType"
            java.util.Objects.requireNonNull(r9, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, h7.i0<?>> r0 = r8.f11506b
            java.lang.Object r0 = r0.get(r9)
            h7.i0 r0 = (p124h7.InterfaceC2666i0) r0
            if (r0 != 0) goto Ld1
            h7.j0 r0 = r8.f11505a
            h7.q r0 = (p124h7.C2809q) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<h7.yg> r1 = p124h7.AbstractC2970yg.class
            java.lang.Class<?> r2 = p124h7.C2702k0.f11686a
            boolean r2 = r1.isAssignableFrom(r9)
            if (r2 != 0) goto L35
            java.lang.Class<?> r2 = p124h7.C2702k0.f11686a
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
            h7.w r0 = r0.f11845a
            h7.v r2 = r0.mo7011a(r9)
            boolean r0 = r2.mo6768b()
            java.lang.String r3 = "Protobuf runtime is not correctly loaded."
            boolean r1 = r1.isAssignableFrom(r9)
            if (r0 == 0) goto L71
            if (r1 == 0) goto L5b
            h7.v0<?, ?> r0 = p124h7.C2702k0.f11689d
            h7.ng<?> r1 = p124h7.C2808pg.f11842a
            h7.ng<?> r1 = p124h7.C2808pg.f11842a
            h7.x r2 = r2.mo6767a()
            h7.b0 r3 = new h7.b0
            r3.<init>(r0, r1, r2)
        L58:
            r0 = r3
            goto Lc5
        L5b:
            h7.v0<?, ?> r0 = p124h7.C2702k0.f11687b
            h7.ng<?> r1 = p124h7.C2808pg.f11843b
            if (r1 == 0) goto L6b
            h7.x r2 = r2.mo6767a()
            h7.b0 r3 = new h7.b0
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
            int r1 = r2.mo6769c()
            if (r1 != r5) goto L7d
            r0 = 1
        L7d:
            if (r0 == 0) goto L8a
            h7.c0 r0 = p124h7.C2576d0.f11432b
            h7.m r1 = p124h7.AbstractC2737m.f11758b
            h7.v0<?, ?> r3 = p124h7.C2702k0.f11689d
            h7.ng<?> r4 = p124h7.C2808pg.f11842a
            h7.ng<?> r4 = p124h7.C2808pg.f11842a
            goto L90
        L8a:
            h7.c0 r0 = p124h7.C2576d0.f11432b
            h7.m r1 = p124h7.AbstractC2737m.f11758b
            h7.v0<?, ?> r3 = p124h7.C2702k0.f11689d
        L90:
            h7.t r5 = p124h7.C2881u.f11932b
            goto Lbc
        L93:
            int r1 = r2.mo6769c()
            if (r1 != r5) goto L9a
            r0 = 1
        L9a:
            if (r0 == 0) goto Lb4
            h7.c0 r0 = p124h7.C2576d0.f11431a
            h7.m r1 = p124h7.AbstractC2737m.f11757a
            h7.v0<?, ?> r4 = p124h7.C2702k0.f11687b
            h7.ng<?> r5 = p124h7.C2808pg.f11843b
            if (r5 == 0) goto Lae
            h7.t r3 = p124h7.C2881u.f11931a
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
            h7.c0 r0 = p124h7.C2576d0.f11431a
            h7.m r1 = p124h7.AbstractC2737m.f11757a
            h7.v0<?, ?> r3 = p124h7.C2702k0.f11688c
            h7.t r5 = p124h7.C2881u.f11931a
        Lbc:
            r6 = r4
            r7 = r5
            r4 = r1
            r5 = r3
            r3 = r0
        Lc1:
            h7.a0 r0 = p124h7.C2521a0.m6420G(r2, r3, r4, r5, r6, r7)
        Lc5:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, h7.i0<?>> r1 = r8.f11506b
            java.lang.Object r9 = r1.putIfAbsent(r9, r0)
            h7.i0 r9 = (p124h7.InterfaceC2666i0) r9
            if (r9 != 0) goto Ld0
            goto Ld1
        Ld0:
            return r9
        Ld1:
            return r0
    }
}
